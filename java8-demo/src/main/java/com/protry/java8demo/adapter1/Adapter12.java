package com.protry.java8demo.adapter1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Adapter12 {

    public static void main(String[] args) {
        List<Apple> inventory = Lists.newArrayList();

        Apple.filterApples(inventory, Apple::isGreenApple);

        Apple.filterApples(inventory, Apple::isHeavyApple);
        Apple.filterApples(inventory, (Apple a) -> "red".equals(a.getColor()));
        Apple.filterApples(inventory, a -> 150>a.getWeight());

    }

    /**
     * old
     * @param inventory
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * old
     * @param inventory
     * @return
     */
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }



}
