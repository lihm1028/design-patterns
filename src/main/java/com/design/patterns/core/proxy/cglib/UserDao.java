package com.design.patterns.core.proxy.cglib;

import com.design.patterns.core.proxy.InvocationH.User;

/**
 * @author li.hongming
 * @date 2023/3/28
 */
public interface UserDao {
    void save(User user);

    User findById(String id);
}
