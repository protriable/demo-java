package com.protry.thy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author shaobin
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringThyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringThyDemoApplication.class, args);
    }
}
