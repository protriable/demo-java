package com.protry.pattern.strategry.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class ConcreteStrategyB implements Strategy {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategyB.class);

    @Override
    public void strategyInterface() {
            logger.info("具体的策略方法策略B");
    }
}
