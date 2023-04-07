package com.design.patterns.core.proxy.dynamicProxy;

/**
 * Created by lihongming on 16/6/20.
 */
public class SubjectImpl implements Subject {

    @Override
    public void doSomething() {
        System.out.println("do something!");
    }
}
