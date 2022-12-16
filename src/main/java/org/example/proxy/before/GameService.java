package org.example.proxy.before;

// 상속할 클래스가 final이면 상속 못한다.
public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("스파로스 파이팅");
    }
}