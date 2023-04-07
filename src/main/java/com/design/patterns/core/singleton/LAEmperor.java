package com.design.patterns.core.singleton;

/**
 * 单例模式
 * 类只有一个实例,而且自行实例化并向整个系统提供这个实例
 * Created by lihongming on 16/6/5.
 */
public class LAEmperor {

    private static volatile LAEmperor emperor;

    private LAEmperor() {
    }

    public static LAEmperor getInstance() {
        if (emperor == null) {
            synchronized (LAEmperor.class) {
                try {
                    // 模拟在创建对象之前做一些准备工作
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (emperor == null) {
                    emperor = new LAEmperor();
                }
            }
        }
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝唐太宗..." + emperor.toString());
    }
}
