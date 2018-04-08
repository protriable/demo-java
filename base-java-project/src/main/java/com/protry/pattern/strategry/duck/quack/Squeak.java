package com.cloud.pattern.strategry.duck.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class Squeak implements QuackBehavior {

    private static final Logger logger = LoggerFactory.getLogger(QuackBehavior.class);

    @Override
    public void quack() {
        logger.info("Squeak");
    }
}
