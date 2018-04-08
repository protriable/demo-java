package com.cloud.pattern.strategry.cal;

/**
 * @author bshao
 */
public class AddStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
