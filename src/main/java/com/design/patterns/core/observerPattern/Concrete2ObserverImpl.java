package com.design.patterns.core.observerPattern;

public class Concrete2ObserverImpl implements Observer {


    protected Subject observable;

    public Concrete2ObserverImpl(Subject observable) {
        this.observable = observable;
        observable.register(this);
    }


    @Override
    public void update() {
        System.out.println(this.hashCode() + "观察者2收到消息:" + observable.getAction());
    }
}
