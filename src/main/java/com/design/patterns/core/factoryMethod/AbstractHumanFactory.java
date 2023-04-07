package com.design.patterns.core.factoryMethod;

/**
 * Created by lihongming on 16/6/5.
 */
public abstract class AbstractHumanFactory {


    public abstract <T extends Human> T createHuman(Class<T> c);


}
