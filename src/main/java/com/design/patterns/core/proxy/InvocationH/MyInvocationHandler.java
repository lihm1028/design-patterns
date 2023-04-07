package com.design.patterns.core.proxy.InvocationH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author li.hongming
 * @date 2023/4/3
 */
public class MyInvocationHandler implements InvocationHandler {

    //被代理实例
    private Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用开始"+method.getName());
        //invoke反射创建对象
        Object invoke = method.invoke(this.obj, args);
        System.out.println("调用结束"+method.getName());
        return invoke;
    }


}
