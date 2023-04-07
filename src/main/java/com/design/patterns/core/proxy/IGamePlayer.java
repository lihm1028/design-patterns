package com.design.patterns.core.proxy;

/**
 * Created by lihongming on 16/6/5.
 */
public interface IGamePlayer {

    void login(String user, String password);

    void killBoss();

    void upgrade();

    /**
     * 每个人都可以找到自己的代理
     *
     * @return
     */
    IGamePlayer getProxy();
}
