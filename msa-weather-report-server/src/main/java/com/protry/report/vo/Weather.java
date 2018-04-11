package com.protry.report.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author protry
 * 天气
 */
@Data
public class Weather implements Serializable {

    private String city;
    private Yesterday yesterday;
    private String aqi;
    private List<Forecast> forecast;
    private String ganmao;
    private String wendu;
}
