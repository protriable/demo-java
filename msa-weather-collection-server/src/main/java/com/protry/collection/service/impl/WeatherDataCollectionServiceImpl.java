package com.protry.collection.service.impl;

import com.protry.collection.enums.TimeUnitEnum;
import com.protry.collection.service.WeatherDataCollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author protry
 */
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini";

    private static final Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void syncDataByCityId(String cityId) {

        String uri = WEATHER_URI + "?citykey=" + cityId;

        this.saveWeatherData(uri);
    }

    private void saveWeatherData(String uri) {
        String strBody = null;

        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();

        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);

        if (respString.getStatusCodeValue() == 200) {
            strBody = respString.getBody();
        }

        //把数据写入缓存中
        if (null != strBody){
            valueOperations.set(uri, strBody, TimeUnitEnum.HAVE_HOUR_SECOND.getValue(), TimeUnit.SECONDS);
        }
    }
}
