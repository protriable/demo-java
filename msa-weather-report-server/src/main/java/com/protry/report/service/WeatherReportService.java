package com.protry.report.service;


import com.protry.report.vo.Weather;

/**
 * @author protry
 */
public interface WeatherReportService {

    /**
     * 根据城市ID获取天气
     * @param cityId
     * @return
     */
    Weather getWeatherByCityId(String cityId);
}
