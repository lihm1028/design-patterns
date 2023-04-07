package com.design.patterns.core.singleton;

/**
 * Created by lihongming on 16/6/5.
 */
public class Minister {

    public static void main(String[] args) {
//        for (int day = 0; day < 3; day++) {
////            Emperor emperor = Emperor.getInstance();
////            emperor.say();
//            LEmperor lEmperor = LEmperor.getInstance();
//            lEmperor.say();
//        }




        /**
         * 线程安全
         */
        for(int i =0;i<5;i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Emperor emperor = Emperor.getInstance();
                    emperor.say();
                    System.out.println(emperor.hashCode());
                }
            });
            t1.start();
        }

        System.out.println("######################################################1");

        /**
         * 线程不安全
         */
//        for(int i =0;i<5;i++) {
//            Thread t1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    LEmperor lEmperor = LEmperor.getInstance();
//                    lEmperor.say();
//                    System.out.println(lEmperor.hashCode());
//                }
//            });
//            t1.start();
//        }


        System.out.println("######################################################2");

        /**
         * 线程不安全
         */
        for(int i =0;i<5;i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    LAEmperor lEmperor = LAEmperor.getInstance();
                    LAEmperor.say();
                }
            });
            t1.start();
        }





    }
}
