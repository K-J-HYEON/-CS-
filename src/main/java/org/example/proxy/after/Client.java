package org.example.proxy.after;

// 클라이언트가 DefaultGameService를 쓰긴 써야하는데 직접 쓰는것이 아닌
// GameServiceProxy를 거쳐서 쓰게 된다.
public class Client {
    public static void main(String[] args) {
//        GameService gameService = new GameServiceProxy(new DefaultGameService());
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
