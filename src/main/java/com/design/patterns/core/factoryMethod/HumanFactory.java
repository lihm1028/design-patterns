package com.design.patterns.core.factoryMethod;

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {

        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (T) human;
    }
}
