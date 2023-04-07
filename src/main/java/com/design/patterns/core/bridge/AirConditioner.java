package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class AirConditioner implements ElectricAppliance{
    private final String name = "空调";
    @Override
    public String description() {
        return name;
    }
}
