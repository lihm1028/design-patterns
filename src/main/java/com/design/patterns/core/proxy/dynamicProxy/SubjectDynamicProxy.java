package com.design.patterns.core.proxy.dynamicProxy;

import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * SubjectDynamicProxy
 * 公共实现,方便外部调用
 * Created by lihongming on 16/6/20.
 */
public class SubjectDynamicProxy extends DynamicProxy {


    public static <T> T newProxyInstace(Subject subject) {

        //获取类的装载器
        ClassLoader classLoader = subject.getClass().getClassLoader();
        //获取类实现的所有接口
        Class<?>[] interfaces = subject.getClass().getInterfaces();

        //获取handle
        MyInvocationHanler invocationHanler = new MyInvocationHanler(subject);

        return newProxyInstance(classLoader, interfaces, invocationHanler);
    }

    public static void main(String[] args) {

        Subject subject = new SubjectImpl();
        Subject proxy = SubjectDynamicProxy.newProxyInstace(subject);
        proxy.doSomething();


    }
}
