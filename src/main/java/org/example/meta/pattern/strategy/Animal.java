package org.example.meta.pattern.strategy;


import org.example.meta.pattern.adapter.Mouse;

// 추상적인 타겟으로 옮겨 바라보는 것
public abstract class Animal extends Mouse {
    public abstract String getName();

}
