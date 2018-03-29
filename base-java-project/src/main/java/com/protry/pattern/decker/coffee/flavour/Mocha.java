package com.protry.pattern.decker.coffee.flavour;

import com.protry.pattern.decker.coffee.Beverage;
import com.protry.pattern.decker.coffee.flavour.CondimentDecorator;

/**
 * @author bshao
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
