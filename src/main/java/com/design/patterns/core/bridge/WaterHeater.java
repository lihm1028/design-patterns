package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class WaterHeater implements ElectricAppliance{
    private final String name = "热水器";
    @Override
    public String description() {
        return name;
    }
}
