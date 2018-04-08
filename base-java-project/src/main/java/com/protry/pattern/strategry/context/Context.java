package com.cloud.pattern.strategry.context;

import lombok.Data;

/**
 * @author bshao
 */
@Data
public class Context {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
