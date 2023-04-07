package com.design.patterns.core.template;

/**
 * 龙虾餐厅
 * @author li.hongming
 * @date 2023/4/4
 */
public class RestaurantLobsterImpl extends RestaurantTemplate{

    @Override
    void spotMenu() {
        System.out.println("龙虾");
    }

    @Override
    void payment() {
        System.out.println("88元");
    }
}
