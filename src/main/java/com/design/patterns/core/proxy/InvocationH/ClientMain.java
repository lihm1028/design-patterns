package com.design.patterns.core.proxy.InvocationH;

import java.lang.reflect.Proxy;

/**
 *  利用动态代理调用方法
 * @author li.hongming
 * @date 2023/4/3
 */
public class ClientMain {
    public static void main(String[] args) {
        //利用动态代理调用方法
        UserDao userDaoImpl = new UserDaoImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userDaoImpl);
        //类加载器和接口
        ClassLoader classLoader = userDaoImpl.getClass().getClassLoader();
        Class<?>[] interfaces = userDaoImpl.getClass().getInterfaces();
        //创建一个代理实例（类加载器、接口、调用处理程序）
        UserDao userDaoProxy = (UserDao)Proxy.newProxyInstance(classLoader, interfaces, myInvocationHandler);

        userDaoProxy.save(new User("1","horse"));
        System.out.println(userDaoProxy.findById("1"));
    }
}
