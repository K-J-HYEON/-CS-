package org.example.meta.pattern.singleton;

/*
 문지기를 딱 한명만 만들고 싶음
 */
public class DoorMan  {
    // 자바에서 static은 main 메서드를 호출하기 전에 JVM이 읽어서 메모리에 올라오는 친구
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() { // heap이 관리하는 메소드
        return doorMan;
    }

    private DoorMan() {

    }


    public void 쫒아내(Animal a){
        System.out.println(a.getName() + " 쫒아내");

    }
}
