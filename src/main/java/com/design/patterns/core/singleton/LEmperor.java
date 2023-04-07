package com.design.patterns.core.singleton;

/**
 * 单例模式
 * 类只有一个实例,而且自行实例化并向整个系统提供这个实例
 * Created by lihongming on 16/6/5.
 */
public class LEmperor {

    private static LEmperor emperor;

    private LEmperor() {
    }

    public static LEmperor getInstance() {
        if (emperor == null) {
            try {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            emperor = new LEmperor();
        }
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝唐太宗..." + emperor.toString());
    }
}
