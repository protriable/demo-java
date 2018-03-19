package com.protry.pattern.strategry.duck;

import com.protry.pattern.strategry.duck.fly.FlyWithWings;
import com.protry.pattern.strategry.duck.quack.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class MallardDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        logger.info("I'm a real Mallard Duck");
    }
}
