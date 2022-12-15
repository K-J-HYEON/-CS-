package org.example.proxy.after;

public class DefaultGameService implements GameService {


    // SRP Single Responsibility Principle도 지키고 있다. => 원래 본인이 해야 할 일만 하고 있다.
    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분들, 환영합니다.");
    }
}
