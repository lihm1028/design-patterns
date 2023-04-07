package com.design.patterns.core.factoryMethod;

/**
 * 简单工厂模式（静态工厂模式）
 */
public class SimpleHumanFactory {

    public static <T extends Human> T create(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (T) human;
    }
}
