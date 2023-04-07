package com.design.patterns.core.proxy.simple;

/**
 * @author li.hongming
 * @date 2023/3/28
 */
public class UserDaoProxy extends UserDao{
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("commit事务");
    }
}
