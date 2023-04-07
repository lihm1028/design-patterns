package com.design.patterns.core.bridge;

/**
 *  桥接模式 (抽象和实现分离、具有多个维度的变化)
 * 桥接设计模式是将抽象和实现部分分离，使他们都可以独立的变化。他是一种对接结构模式，又称为柄体模式或接口模式。
 * 在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？
 * 如何利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化，而又不引入额外的复杂度？这就要使用Bridge模式。
 * @author li.hongming
 * @date 2023/3/30
 */
public class Client {
    public static void main(String[] args) {

        GreeBrand gree = new GreeBrand(new AirConditioner());
        System.out.println(gree.description());

        HaierBrand haierBrand = new HaierBrand(new WaterHeater());
        System.out.println(haierBrand.description());

        MideaBrand mideaBrand = new MideaBrand(new WashingMachine());
        System.out.println(mideaBrand.description());

    }
}
