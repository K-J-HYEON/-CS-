package org.example.meta.pattern.decorator.notification;

public class SmsNotifier implements Notifier{
    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SmsNotifier() {

    }

    @Override
    public void send() {
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("문자 알림");
    }

}
