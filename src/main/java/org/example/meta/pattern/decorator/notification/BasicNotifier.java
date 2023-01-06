package org.example.meta.pattern.decorator.notification;

public class BasicNotifier implements Notifier{

    @Override
    public void send() {
        System.out.println("기본 알림");
    }
}
