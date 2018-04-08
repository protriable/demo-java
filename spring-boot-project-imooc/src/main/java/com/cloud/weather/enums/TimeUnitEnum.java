package com.cloud.weather.enums;

/**
 * @author protry
 */
public enum TimeUnitEnum {

    HAVE_HOUR_SECOND(1800);

    Integer value;

    TimeUnitEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
