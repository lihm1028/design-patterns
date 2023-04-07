package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class HaierBrand extends BrandBridge {
    private final String name = "海尔";

    public HaierBrand(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    String description() {
        return name + electricAppliance.description();
    }
}
