package com.design.patterns.core.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lihongming on 16/6/15.
 */
public class GamePlayIH implements InvocationHandler {


    /**
     * 被代理者实例
     */
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        
        /**
         * 帐号登陆后发消息
         */
        if (method.getName().equalsIgnoreCase("login")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            System.out.println("帐号在" + dateFormat.format(new Date()) + "登陆了系统");
        }
        return result;
    }
}
