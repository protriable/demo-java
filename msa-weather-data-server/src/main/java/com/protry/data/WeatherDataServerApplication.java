package com.protry.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author protry
 * 数据查询API微服务
 */
@SpringBootApplication
public class WeatherDataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherDataServerApplication.class, args);
    }
}
