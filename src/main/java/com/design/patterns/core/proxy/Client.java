package com.design.patterns.core.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lihongming on 16/6/5.
 */
public class Client {

    public static void main(String[] args) throws Exception {
//        IGamePlayer player = new GamePlayer(null,"李鸿明");
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("开始时间:" + dateFormat.format(new Date()));
//        Thread.sleep(2000l);
//        player.login("lihm", "password");
//
//        player.killBoss();
//        player.upgrade();
//        System.out.println("结束时间:" + dateFormat.format(new Date()));

        System.out.println("######################GamePlayerProxy实现############");
        proxy();

    }

    private static void proxy() throws Exception {

        IGamePlayer player = new GamePlayer("李鸿明");
        IGamePlayer proxy = player.getProxy();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("开始时间:" + dateFormat.format(new Date()));
        //Thread.sleep(2000l);
        proxy.login("lihm", "password");

        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间:" + dateFormat.format(new Date()));


    }


}
