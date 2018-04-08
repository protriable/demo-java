package com.cloud.pattern.strategry.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class ConcreteStrategyA implements Strategy {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategyA.class);

    @Override
    public void strategyInterface() {
            logger.info("具体的策略方法策略A");
    }
}
