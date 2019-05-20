package com.protry.course1;

public class Buick implements Car{

    @Override
    public void start() {
        System.out.println("Buick.Start()");
    }

    @Override
    public void turnRight() {
        System.out.println("Buick.TurnRight()");
    }

    @Override
    public void turnLeft() {
        System.out.println("Buick.TurnLeft()");
    }

    @Override
    public void stop() {
        System.out.println("Buick.Stop()");
    }
}
