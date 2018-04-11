package com.protry.report.service.impl;

import com.protry.report.service.WeatherReportService;
import com.protry.report.vo.Weather;
import org.springframework.stereotype.Service;

/**
 * @author protry
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public Weather getWeatherByCityId(String cityId) {
        //改由天气查询API微服务来提供服务
        Weather weather = new Weather();
        weather.setAqi("aaa");
        weather.setCity("深圳");
        weather.setGanmao("ganmao");
        weather.setWendu("wendu");
        return weather;
    }
}
