package com.design.patterns.core.bridge;

/**
 * @author li.hongming
 * @date 2023/3/30
 */
public abstract class BrandBridge {
    ElectricAppliance electricAppliance;

    public BrandBridge(ElectricAppliance electricAppliance) {
        this.electricAppliance = electricAppliance;
    }

    // 电器品牌名称
    abstract String description();
}
