package com.protry.pattern.strategry.cal;

/**
 * @author bshao
 */
public class MultiplyStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
