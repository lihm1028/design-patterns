package com.design.patterns.core.proxy;

/**代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问
 * Created by lihongming on 16/6/5.
 */
public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    public void before() {
        System.out.println("开始处理requst");

    }

    public void after() {
        System.out.println("处理结束");
    }

    public static void main(String[] args) {

        Subject subject = new RealSubject();
        //传递一个Subject给代理,让代理调用
        Subject proxy = new Proxy(subject);
        proxy.request();
    }
}
