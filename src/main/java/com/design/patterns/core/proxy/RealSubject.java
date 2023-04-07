package com.design.patterns.core.proxy;

/**
 * Created by lihongming on 16/6/5.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("业务逻辑实现");
    }
}
