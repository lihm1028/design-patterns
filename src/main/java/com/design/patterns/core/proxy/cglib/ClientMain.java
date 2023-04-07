package com.design.patterns.core.proxy.cglib;

import com.design.patterns.core.proxy.InvocationH.User;

/**
 * @author li.hongming
 * @date 2023/4/3
 */
public class ClientMain {

    public static void main(String[] args) {
        // 测试cglib动态代理
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = (UserDao)cglibProxy.getCglibProxy(new UserDaoImpl());
        User user = userDao.findById("2");
        System.out.println(user);
    }
}
