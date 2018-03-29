package com.protry.pattern.factory.pizza.store;

import com.protry.pattern.factory.pizza.Pizza;

/**
 * @author bshao
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
