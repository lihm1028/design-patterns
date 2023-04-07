package com.design.patterns.core.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private String content;

    /**
     * 将无参构造方法加private进行私有
     */
    private Singleton() {
    }

    /*
     * 会经过三步
     * 1.分配内存空间
     * 2.执行构造方法，初始化对象
     * 3.把这个对象指向这个空间
     * 正常情况是123
     * 但是可能会132
     * 当A线程完成了132，实际上空间里并没有值，当下一个B线程到来后会认为空间里已经有值了，会直接
     * return这个lazyMan，返回一个空值
     * */
    public static Singleton getInstrance() {
        return singleton;
    }


    public void display() {
        System.out.println(this.hashCode() + " content:" + content);
    }

    public void setContent(String content) {
        this.content = content;
    }


}
