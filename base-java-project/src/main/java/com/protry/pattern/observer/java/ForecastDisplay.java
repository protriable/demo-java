package com.cloud.pattern.observer.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bshao
 */
public class ForecastDisplay extends Observable implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(ForecastDisplay.class);
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) arg;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        logger.info("ForecastDisplay conditions: temperature={}F degrees and {}% humidity", temperature, humidity);
    }
}
