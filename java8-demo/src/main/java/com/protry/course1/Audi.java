package com.protry.course1;

public class Audi implements Car {

    @Override
    public void start() {
        System.out.println("Audi.Start()");
    }

    @Override
    public void turnRight() {
        System.out.println("Audi.TurnRight()");
    }

    @Override
    public void turnLeft() {
        System.out.println("Audi.TurnLeft()");
    }

    @Override
    public void stop() {
        System.out.println("Audi.Stop()");
    }
}
