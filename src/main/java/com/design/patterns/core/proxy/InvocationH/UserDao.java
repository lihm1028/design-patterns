package com.design.patterns.core.proxy.InvocationH;

/**
 * @author li.hongming
 * @date 2023/3/28
 */
public interface UserDao {
    void save(User user);

    User findById(String id);
}
