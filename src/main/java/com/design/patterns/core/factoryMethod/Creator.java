package com.design.patterns.core.factoryMethod;

/**
 * Created by lihongming on 16/6/5.
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
