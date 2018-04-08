package com.cloud.pattern.observer.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    private static final Logger logger = LoggerFactory.getLogger(StatisticsDisplay.class);

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("Avg/Max/Min temperature={}F degrees and %humidity{} ");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
