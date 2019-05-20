package com.protry.course1;

public class ZhangSanWithCar extends HumanWithCar {

//    Audi audi = new Audi();
    private Car car;

    public ZhangSanWithCar(Car car) {
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
