package org.example.proxy.after;

public class DefaultGameService implements GameService {

    // 단일 책임 원칙 (SRP Single Responsibility Principle도 지키고 있다.) => 원래 본인이 해야 할 일만 하고 있다.
    @Override
    public void startGame() {
        System.out.println("스파로스 파이팅");
    }
}
