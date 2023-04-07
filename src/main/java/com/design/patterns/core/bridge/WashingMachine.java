package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class WashingMachine implements ElectricAppliance{
    private final String name = "洗衣机";
    @Override
    public String description() {
        return name;
    }
}
