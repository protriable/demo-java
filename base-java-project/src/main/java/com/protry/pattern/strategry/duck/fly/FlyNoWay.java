package com.protry.pattern.strategry.duck.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class FlyNoWay implements FlyBehavior {

    private static final Logger logger = LoggerFactory.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        logger.info("I can't fly");
    }
}
