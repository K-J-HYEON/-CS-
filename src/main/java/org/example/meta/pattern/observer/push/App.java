package org.example.meta.pattern.observer.push;

import org.example.meta.pattern.observer.push.pub.LgMart;
import org.example.meta.pattern.observer.push.pub.LotteMart;
import org.example.meta.pattern.observer.push.pub.Mart;
import org.example.meta.pattern.observer.push.sub.Cus1;
import org.example.meta.pattern.observer.push.sub.Cus2;
import org.example.meta.pattern.observer.push.sub.Cus3;
import org.example.meta.pattern.observer.push.sub.Customer;

/*
 * 옵저버 페턴(push)
 */
public class App {
    public static void main(String[] args) {
        Mart lotteMart = new LotteMart();
        Mart lgMart = new LgMart();

        Customer cus1 = new Cus1();
        Customer cus2 = new Cus2();
        Customer cus3 = new Cus3();

        // 고객 등록 (구독하기)
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        // 고객 등록 구독하기)
        lgMart.add(cus3);

        // 마트 : 롯데 상품아 빨리 도착해!!
        new Thread(() -> {
            lotteMart.received();
        }).start();

        // 마트 : 엘지 상품아 빨리 도착해!!
        new Thread(() -> {
            lgMart.received();
        }).start();
    }
}
