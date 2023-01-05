package org.example.meta.pattern.proxy;


// 전략 패턴 => 디자인 패턴의 꽃
// 문지기는 성을 지키고 침입자가 들어오면 쫒아낸다.
// 쥐 호랑이 특정 2개종 에서 => 동물을 침입자로 선정(한번에 쥐 호랑이 다 쫒아낸다)
// target을 동물로 지정해놓고 추상화 시키는 것이다. => 즉 타겟을 추상화 시키는 패턴
public class Mouse extends Animal {
    private String name = "쥐";

    public String getName() {
        return name;
    }
}
