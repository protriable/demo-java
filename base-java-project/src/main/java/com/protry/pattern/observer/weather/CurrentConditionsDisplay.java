package com.protry.pattern.observer.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("Current conditions: temperature={}F degrees and %humidity{} ");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
