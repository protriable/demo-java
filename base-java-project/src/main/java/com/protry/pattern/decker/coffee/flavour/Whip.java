package com.protry.pattern.decker.coffee.flavour;

import com.protry.pattern.decker.coffee.Beverage;
import com.protry.pattern.decker.coffee.flavour.CondimentDecorator;

/**
 * @author bshao
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ". Whip";
    }

    @Override
    public double cost() {
        return 0.66 + beverage.cost();
    }
}
