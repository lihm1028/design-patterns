package com.design.patterns.core.proxy.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lihongming on 16/6/20.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {

        if (true) {
            (new BeforeAdvice()).exec();
        }
        T t = (T) Proxy.newProxyInstance(loader, interfaces, handler);
        return t;
    }

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        InvocationHandler invocationHandler = new MyInvocationHanler(subject);

        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        Subject proxy = DynamicProxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        proxy.doSomething();



    }
}
