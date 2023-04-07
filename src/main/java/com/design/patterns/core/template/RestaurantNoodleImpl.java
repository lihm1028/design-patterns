package com.design.patterns.core.template;

/**
 * 面条餐厅
 * @author li.hongming
 * @date 2023/4/4
 */
public class RestaurantNoodleImpl extends RestaurantTemplate{
    @Override
    void spotMenu() {
        System.out.println("青椒肉丝面");
    }

    @Override
    void payment() {
        System.out.println("16元");
    }
}
