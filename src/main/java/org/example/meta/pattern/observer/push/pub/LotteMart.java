package org.example.meta.pattern.observer.push.pub;

import org.example.meta.pattern.observer.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{

    // 고객 명단
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void received() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            notifyChange("롯데상품 들어왔어");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 모든 고객중에 등록된 손님에게 알림을 보내야
    @Override
    public void notifyChange(String msg) {
        customerList.forEach((c) -> {
            c.update(msg);
        });
    }
}
