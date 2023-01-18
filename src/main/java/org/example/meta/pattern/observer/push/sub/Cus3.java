package org.example.meta.pattern.observer.push.sub;

public class Cus3 implements Customer{

    @Override
    public void update(String msg) {
        System.out.println("손님3이 받은 알림 : " + msg);
    }
}
