package com.design.patterns.core.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class JavaUserObserver implements Observer {

    private String name;

    public JavaUserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到新推送：" + arg);
    }
}