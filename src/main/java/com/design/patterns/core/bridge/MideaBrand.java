package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public class MideaBrand extends BrandBridge {
    private final String name = "美的";

    public MideaBrand(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    String description() {
        return name + electricAppliance.description();
    }
}
