package com.protry.java8demo.adapter1;

import java.util.ArrayList;
import java.util.List;

public class Apple {

    private String color;

    private Integer weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    interface Predicate<T> {
        boolean accept(T t);
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (p.accept(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
