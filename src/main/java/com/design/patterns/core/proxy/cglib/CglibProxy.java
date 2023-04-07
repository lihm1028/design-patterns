package com.design.patterns.core.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author li.hongming
 * @date 2023/4/3
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;//需要代理的目标对象


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CglibProxy开始"+method.getName());
        Object invoke = method.invoke(target, objects);
        System.out.println("CglibProxy开始"+method.getName());
        return invoke;
    }

    public Object getCglibProxy(Object objTarget){
        target=objTarget;
        Enhancer enhancer = new Enhancer();
        //指定父类创建的类实例
        enhancer.setSuperclass(objTarget.getClass());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }


}
