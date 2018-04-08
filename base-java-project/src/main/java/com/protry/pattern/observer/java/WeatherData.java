package com.cloud.pattern.observer.java;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Observable;

/**
 * @author bshao
 */
@NoArgsConstructor
public class WeatherData extends Observable {

    @Getter
    private float temperature;
    @Getter
    private float humidity;
    @Getter
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
