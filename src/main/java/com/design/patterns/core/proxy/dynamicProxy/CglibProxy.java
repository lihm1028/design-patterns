package com.design.patterns.core.proxy.dynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object target;//需要代理的目标对象

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理，监听开始！");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib动态代理，监听结束！");
        return invoke;
    }

    //定义获取代理对象方法
    public Object getCglibProxy(Object objectTarget) {
        //为目标对象target赋值
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);// 设置回调
        Object result = enhancer.create();//创建并返回代理对象
        return result;
    }
}
