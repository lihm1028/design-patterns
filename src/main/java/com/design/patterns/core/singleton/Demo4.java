package com.design.patterns.core.singleton;

/**
 * 枚举单例
 *
 * @author li.hongming
 * @date 2023/3/28
 */
public class Demo4 {

    public static Demo4 getInstance(){
        return Demo.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        Demo4 demo1 = Demo4.getInstance();
        Demo4 demo2 = Demo4.getInstance();
        System.out.println(demo1.hashCode());
        System.out.println(demo2.hashCode());
        System.out.println(demo1 == demo2);
    }

    //枚举单例
    public static   enum Demo{
        INSTANCE;

        private Demo4 demo4;

       private Demo() {
           System.out.println("枚举私有构造函数");
            this.demo4 = new Demo4();
        }

        public Demo4 getInstance() {
            return demo4;
        }
    }
}
