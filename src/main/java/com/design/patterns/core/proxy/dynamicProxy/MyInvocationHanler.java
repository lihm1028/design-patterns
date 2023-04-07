package com.design.patterns.core.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyInvocationHanler
 * Created by lihongming on 16/6/20.
 */
public class MyInvocationHanler implements InvocationHandler {

    /**
     * 被代理实例
     */
    private Object obj;

    public MyInvocationHanler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理，监听开始！");
        Object invoke = method.invoke(this.obj, args);
        System.out.println("JDK动态代理，监听结束！");
        return invoke;
    }
}
