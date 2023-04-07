package com.design.patterns.core.observerPattern;

import java.util.Observable;

public class JavaObservable extends Observable {
    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    public void doSomething(String content) {
        setChanged();
        notifyObservers(content);
    }

}
