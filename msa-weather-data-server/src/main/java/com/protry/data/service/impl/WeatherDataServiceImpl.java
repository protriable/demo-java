package com.protry.data.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.protry.data.service.WeatherDataService;
import com.protry.data.vo.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author protry
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini";

    private static final Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI + "?citykey=" + cityId;


        return this.doGetWeather(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_URI + "?city=" + cityName;

        return this.doGetWeather(uri);
    }

    private WeatherResponse doGetWeather(String uri) {
//        ResponseEntity<WeatherResponse> weatherResponseResponseEntity = restTemplate.getForEntity(uri, WeatherResponse.class);

        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse resp = null;
        String strBody = null;

        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();

        //先查缓存，如果有缓存就使用缓存，如果没有缓存抛出异常
        if (stringRedisTemplate.hasKey(uri)) {
            logger.info("Redis have Data");
            strBody = valueOperations.get(uri);
        } else {
            logger.info("Redis have no Data");
            throw new RuntimeException("Redis have no Data");
//            ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);
//
//
//            if (respString.getStatusCodeValue() == 200) {
//                strBody = respString.getBody();
//            }
//
//            //把数据写入缓存中
//            if (null != strBody){
//                valueOperations.set(uri, strBody, 1800, TimeUnit.SECONDS);
//            }

        }

        try {
            resp = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            logger.info("Error.", e);
        }

        return resp;
    }
}
