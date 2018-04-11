package com.protry.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author protry
 * 城市数据收集APi微服务
 */
@SpringBootApplication
public class WeatherCityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCityServerApplication.class, args);
    }
}
