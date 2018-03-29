package com.protry.pattern.decker.coffee;

/**
 * @author bshao
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.22;
    }
}
