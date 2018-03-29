package com.protry.pattern.factory.pizza;

import lombok.Getter;

import java.util.ArrayList;

/**
 * @author bshao
 */
public abstract class Pizza {

    @Getter
    private String name;
    private String dough;
    private String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println(" " + topping.toString());
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }


}
