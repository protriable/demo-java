package com.protry.pattern.decker.coffee;

import lombok.Getter;

/**
 * @author bshao
 * 饮料 抽象组建 AbstractComponent
 */
public abstract class Beverage {

    @Getter
    protected String description = "Unknown Beverage";

    /**
     * 计算费用
     * @return 费用
     */
    public abstract double cost();
}
