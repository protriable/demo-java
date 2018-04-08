package com.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author protry
 * 天气响应
 */
@Data
public class WeatherResponse implements Serializable {

    private Weather data;

    private String status;

    private String desc;
}
