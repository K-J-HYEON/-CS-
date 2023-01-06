package org.example.meta.pattern.factory;


// 팩토리 패턴!
public class App {
    public static void main(String[] args) {
        DBFactory dbFactory = new DBFactory();

        // 내가 MariaDB 객체를 알 필요가 없고
        // setUrl 부터 해야 할지, excute 부터 해야 할지 생각할 필요가 없다.
        // 문자열만 추가해서 DB를 생성하면 되고, (의존할 것은 DBFactory)

        DB maria = dbFactory.createDB("maria");
        maria.execute("select");

        DB mysql = dbFactory.createDB("mysql");
        mysql.execute("select");
    }
}
