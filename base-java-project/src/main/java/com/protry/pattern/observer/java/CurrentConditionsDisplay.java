package com.protry.pattern.observer.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bshao
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        logger.info("Current conditions: temperature={}F degrees and {}% humidity", temperature, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) arg;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
