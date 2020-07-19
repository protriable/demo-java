package com.protry.course1;

public class HumanWithCar implements Human {

    private Car car;

    public HumanWithCar() {
    }

    public HumanWithCar(Car car) {
        this.car = car;
    }

    @Override
    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
