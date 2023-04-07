package com.design.patterns.core.observerPattern;

import java.util.Arrays;

public class Client2 {
    public static void main(String[] args) {


        //定义一个observable
        JavaObservable javaObservable = new JavaObservable();
        // 定义个观察者
        JavaUserObserver user1 = new JavaUserObserver("孔子");

        // 定义个观察者
        JavaUserObserver user2 = new JavaUserObserver("老子");
        javaObservable.addObserver(user1);
        javaObservable.addObserver(user2);

        javaObservable.doSomething("看书");
        javaObservable.doSomething("工作");
        javaObservable.doSomething("吃饭");
        javaObservable.doSomething("睡觉");


//        String[] strings = new String[]{"cpabc324234", "clientSecret", "dbName",
//                "tableName", String.valueOf(System.currentTimeMillis())};
//        System.out.println(String.join("-", strings));
//        Arrays.sort(strings);
//        System.out.println(String.join("-", strings));


    }
}
