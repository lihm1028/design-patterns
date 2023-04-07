package com.design.patterns.core.factoryMethod;

/**
 * Created by lihongming on 16/6/5.
 */
public abstract class Product {

    public void method1() {
        System.out.println("产品类的公共方法");
    }

    public abstract void method2();
}
