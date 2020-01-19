package com.protry.pattern.strategry.duck;

import com.protry.pattern.strategry.duck.fly.FlyNoWay;
import com.protry.pattern.strategry.duck.quack.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class ModelDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(ModelDuck.class);

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        logger.info("I'm a Model Duck! HaHa");
    }
}
