package com.design.patterns.core.template;

/**
 * 餐厅模板
 * @author li.hongming
 * @date 2023/4/4
 */
public abstract class RestaurantTemplate {


    // 1.看菜单
    public void menu(){
        System.out.println("看菜单");
    }

    // 2.点菜
    abstract void spotMenu();

    // 3.吃饭
    public void havingDinner(){
        System.out.println("吃饭");
    }

    // 4.付款
    abstract void payment();


    public void leave(){
        System.out.println("离开");
    }


    // 过程
    public void process(){
        menu();
        spotMenu();
        havingDinner();
        payment();
        leave();
    }
}
