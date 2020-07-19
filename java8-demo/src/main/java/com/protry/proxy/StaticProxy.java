package com.protry.proxy;

/**
 * 静态代理类(中介、代理)
 * 需要被代理类实现相同的接口
 */
public class StaticProxy implements RentalHouse{

    private RentalHouse rentalHouse;

    public StaticProxy(RentalHouse rentalHouse) {
        this.rentalHouse = rentalHouse;
    }

    @Override
    public void rent() {
        System.out.println("我是中介,收你500手续费");
        rentalHouse.rent();
        System.out.println("我是中介,又收你100手续费");
    }
}
