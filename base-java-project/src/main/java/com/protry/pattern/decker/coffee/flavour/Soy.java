package com.protry.pattern.decker.coffee.flavour;

import com.protry.pattern.decker.coffee.Beverage;
import com.protry.pattern.decker.coffee.flavour.CondimentDecorator;

/**
 * @author bshao
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.42 + beverage.cost();
    }
}
