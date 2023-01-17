package org.example.meta.pattern.observer.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();
        Customer2 customer2 = new Customer2();


        // 다른 쓰레드에서 실행
        new Thread(() -> {
            // 5초후에 value값이 들어옴.
            lotteMart.received();
        }).start();


        // 메인 스레드에서 실행!!
        // 한번 물어보면 해결되지 않는다.
        while (true) {

            // 어느 정도의 시간을 정해서 물어보자. 폴링!! 1초
            try {
                System.out.println("상품 들어왔나요?..........");
                // 물어보는 시간이 짧으면 상품이 들어온 걸 빠르게 알 수 있다. => 누구보다 빨리 구매 가능 / 계속 물어봐야 하니 지친다.
                // 물어보는 시간이 길면? => 빠르게 알 수 없다. => 덜 지친다 / 구매를 못할 수 도 있다.
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (lotteMart.getValue() != null) {
                customer1.update(lotteMart.getValue() + "가 들어왔습니다.");
                customer2.update(lotteMart.getValue() + "가 들어왔습니다.");
                break;
            } else {
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }
        }

    }
}
