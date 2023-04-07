package com.design.patterns.core.observerPattern;

// 抽象主题，提供一个接口可以增加删除观察者
public interface Subject {

    /**
     * 增加观察者
     *
     * @param observer
     */
    void register(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知已注册的观察者
     */
    void notifyObservers();

    String getAction();

    //设置行动
    void setAction(String action);


}
