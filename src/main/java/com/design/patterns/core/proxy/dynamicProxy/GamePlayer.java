package com.design.patterns.core.proxy.dynamicProxy;


/**
 * Created by lihongming on 16/6/5.
 */
public class GamePlayer implements IGamePlayer {


    /**
     * 游戏玩家name
     */
    private String name = "";


    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {

        System.out.println(String.format("登录名为%s的用户%s登陆成功!", user, this.name));

    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪!");
    }


    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了1级!");
    }


}
