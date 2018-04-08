package com.cloud.pattern.strategry.duck.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class MuteQuack implements QuackBehavior {

    private static final Logger logger = LoggerFactory.getLogger(MuteQuack.class);

    @Override
    public void quack() {
        logger.info("<< Silence >>");
    }
}
