package com.protry.pattern.decker.coffee.flavour;

import com.protry.pattern.decker.coffee.Beverage;

/**
 * @author bshao
 */
public class Decaf extends CondimentDecorator {

    private Beverage beverage;

    public Decaf(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decaf";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
}
