package com.design.patterns.core.template;

/**
 * @author li.hongming
 * @date 2023/4/4
 */
public class Client {
    public static void main(String[] args) {
        // 进入龙虾餐厅
        RestaurantTemplate template = new RestaurantLobsterImpl();
        template.process();
    }
}
