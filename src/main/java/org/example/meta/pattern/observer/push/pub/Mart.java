package org.example.meta.pattern.observer.push.pub;

import org.example.meta.pattern.observer.push.sub.Customer;

public interface Mart {

    // 고객 등록
    void add(Customer customer);

    // 고객 해제
    void remove(Customer customer);

    // 상품 받기
    void received();

    // 알림
    void notifyChange(String msg);


}
