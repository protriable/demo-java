package com.protry.pattern.strategry.duck;

import com.protry.pattern.strategry.duck.fly.FlyBehavior;
import com.protry.pattern.strategry.duck.quack.QuackBehavior;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 * 鸭子基类
 */
public abstract class Duck {

    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    @Setter
    public QuackBehavior quackBehavior;
    @Setter
    public FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        logger.info("All ducks float, even decoys!");
    }



}
