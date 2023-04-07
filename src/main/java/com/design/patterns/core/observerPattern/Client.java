package com.design.patterns.core.observerPattern;

public class Client {
    public static void main(String[] args) {


        ConcreteSubject observable = new ConcreteSubject();


        //注册观察者
        Concrete1ObserverImpl observer1 = new Concrete1ObserverImpl(observable);
//        observable.register(observer1);
//        observable.register(observer1);
        Concrete2ObserverImpl observer2 = new Concrete2ObserverImpl(observable);
//        observable.register(observer2);

        //开始活动
        observable.setAction("PHP是世界上最好用的语言");


        observable.remove(observer1);
        observable.setAction("JAVA是世界上最好用的语言！");


    }
}
