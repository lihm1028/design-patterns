package com.design.patterns.core.observerPattern;

public class Concrete1ObserverImpl implements Observer {

    protected Subject observable;

    public Concrete1ObserverImpl(Subject observable) {
        this.observable = observable;
        observable.register(this);
    }

    @Override
    public void update() {
        System.out.println(this.hashCode() + "观察者1收到消息:" + observable.getAction());
    }
}
