package com.protry.pattern.observer.weather;

/**
 * @author bshao
 * 观察者
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
