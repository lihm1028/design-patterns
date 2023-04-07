package com.design.patterns.core.proxy;

/**
 * Created by lihongming on 16/6/5.
 */
public class GamePlayer implements IGamePlayer {

    private IGamePlayer proxy = null;

    /**
     * 游戏玩家name
     */
    private String name = "";


    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (isProxy()) {
            System.out.println(String.format("登录名为%s的用户%s登陆成功!", user, this.name));
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + "在打怪!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }


    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println(this.name + "又升了1级!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
          this.proxy=new GamePlayerProxy(this);
        return this.proxy;
    }

    public boolean isProxy() {
        if (proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
