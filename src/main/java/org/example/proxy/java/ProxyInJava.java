//package org.example.proxy.java;
//import org.example.proxy.after.DefaultGameService;
//
//import java.lang.reflect.Proxy;
//
//public class ProxyInJava {
//
//    public static void main(String[] args) {
//        ProxyInJava proxyInJava = new ProxyInJava();
//        proxyInJava.dynamicProxy();
//    }
//
//    private void dynamicProxy() {
//        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
//        gameServiceProxy.startGame();
//    }
//
//
//    // 프록시 인스턴스 생성
//    private GameService getGameServiceProxy(GameService target) {
//        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader()),
//            new Class[]{GameService.class}, (proxy, method, args) -> {
//
//            }
//    }
//}
