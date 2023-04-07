package com.design.patterns.core.proxy.InvocationH;

/**
 * @author li.hongming
 * @date 2023/4/3
 */
public class User {

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
