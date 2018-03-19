package com.protry.pattern.strategry.duck.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class Quack implements QuackBehavior {

    private static final Logger logger = LoggerFactory.getLogger(Quack.class);
    
    @Override
    public void quack() {
        logger.info("Quack");
    }
}
