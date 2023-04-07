package com.design.patterns.core.singleton;

/**
 * 单例模式
 * 类只有一个实例,而且自行实例化并向整个系统提供这个实例
 * Created by lihongming on 16/6/5.
 */
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝唐太宗..."+emperor.toString());
    }
}
