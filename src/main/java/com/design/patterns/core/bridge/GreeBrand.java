package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class GreeBrand extends BrandBridge {
    private final String name = "格力";

    public GreeBrand(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    String description() {
        return name + electricAppliance.description();
    }
}
