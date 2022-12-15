package org.example.proxy.before;

import org.example.proxy.after.DefaultGameService;
import org.example.proxy.after.GameServiceProxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
