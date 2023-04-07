package com.design.patterns.core.observerPattern;

import java.util.Vector;

public class ConcreteSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    private String action;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer notify : observers) {
            notify.update();
        }
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public void setAction(String action) {
        this.action = action;
        //消息更新，通知所有观察者
        notifyObservers();
    }
}
