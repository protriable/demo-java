package com.cloud.pattern.observer.weather;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @author bshao
 * 气象数据对象
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = Lists.newArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) > -1) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(it -> it.update(temperature, humidity, pressure));
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 模拟气象站的变化
     *
     * @param temperature 变化的温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
