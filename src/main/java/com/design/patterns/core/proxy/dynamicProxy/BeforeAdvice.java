package com.design.patterns.core.proxy.dynamicProxy;

/**
 * Created by lihongming on 16/6/20.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知,我被执行了!");
    }
}
