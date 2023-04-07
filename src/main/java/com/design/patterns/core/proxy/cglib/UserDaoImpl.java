package com.design.patterns.core.proxy.cglib;

import com.design.patterns.core.proxy.InvocationH.User;

/**
 * @author li.hongming
 * @date 2023/3/28
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("用户保存");
    }

    @Override
    public User findById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("lihm");
        user.setMobile("123456");
        return user;
    }
}
