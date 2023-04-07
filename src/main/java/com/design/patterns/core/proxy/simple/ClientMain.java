package com.design.patterns.core.proxy.simple;

/**
 * @author li.hongming
 * @date 2023/3/28
 */
public class ClientMain {
    public static void main(String[] args) {
        // 正常调用
        UserDao userDao = new UserDao();
        userDao.save();

        // 代理调用
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();

    }
}
