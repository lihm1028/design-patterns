package com.design.patterns.core.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class STest {

    public static void main(String[] args) {


        Singleton instrance = Singleton.getInstrance();
        instrance.display();
        instrance.setContent("我是单例");
        instrance.display();

        Singleton.getInstrance().display();



        System.out.println("##############################################3");
        /**
         * 扩展：由图可以看出，普通的单例模式可以通过反射模式生成多个对象，不能彻底达到单例的效果。
         */
        try {
            Class<?> class1 = Class.forName(Singleton.class.getName());
            Constructor[] constructors=class1.getDeclaredConstructors();
            Constructor constructor=constructors[0];
            constructor.setAccessible(true); //在Java中可以通过反射进行获取实体类中的字段值
            Singleton singleton2 = (Singleton) constructor.newInstance(null);
            singleton2.display();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        /**
         *
         *  can not access a member of class com.design.patterns.core.singleton.Singleton with modifiers "private"
         */
//        try {
//            Singleton singleton = (Singleton) Class.forName(Singleton.class.getName()).newInstance();
//            singleton.display();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
