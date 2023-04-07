package com.design.patterns.core.proxy.dynamicProxy;


import com.design.patterns.core.proxy.GamePlayerProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lihongming on 16/6/15.
 */
public class DynamicClient {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("里斯");



        InvocationHandler handler = new GamePlayIH(player);

//        player.killBoss();
//        player.login("lisi", "password");
//        player.upgrade();


        ClassLoader classLoader = player.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);

        proxy.login("lisi", "lisi");
        proxy.killBoss();
        proxy.upgrade();


        Subject subject = new SubjectImpl();

        InvocationHandler invocationHandler = new MyInvocationHanler(subject);
        ClassLoader classLoader1 = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(classLoader1,interfaces, invocationHandler);
        proxyInstance.doSomething();

        System.out.println("################Cglib################################");

        CglibProxy cglibProxy=new CglibProxy();
        TestAbc cglibProxy1 = (TestAbc)cglibProxy.getCglibProxy(new TestAbc());
        cglibProxy1.display();
    }
}
