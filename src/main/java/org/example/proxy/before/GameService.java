package org.example.proxy.before;

// 상속할 클래스가 final이면 상속 못한다.
public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("이 자리에 오신 여러분들, 환영합니다.");
    }
}
