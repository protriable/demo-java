package com.protry.pattern.decker.coffee.flavour;

import com.protry.pattern.decker.coffee.Beverage;

/**
 * @author bshao
 * 抽象装饰者 AbstractDecorator
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
