package org.example.proxy.after;

// 상속을 씀
public class GameServiceProxy implements GameService {

    // 인터페이스까지 반영해서 프록시 패턴적 => 코드가 복잡
    private GameService gameService;

//    public GameServiceProxy(GameService gameService) {
//        this.gameService = gameService;
//    }

    // OCP
    // 지연시켜서 사용하고 있다.
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        // lazy initialization 초기화 지연
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        // 초기화 지연 부분에서 리턴값이 없다 => 캐싱 할 데이터가 없음

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
