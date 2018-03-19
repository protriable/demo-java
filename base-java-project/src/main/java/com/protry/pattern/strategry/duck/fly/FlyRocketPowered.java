package com.protry.pattern.strategry.duck.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class FlyRocketPowered implements FlyBehavior {

    private static final Logger logger = LoggerFactory.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        logger.info("I'm flying with a rocket!");
    }
}
