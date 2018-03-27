package com.protry.controller;

import com.protry.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bshao
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
@RequestMapping("hello")
public class HelloController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private Integer age;

    @Autowired
    private ConfigBean configBean;

    @GetMapping("index")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("value")
    public String value() {
        return name + " AND " + age;
    }

    @GetMapping("my")
    public String myBean() {
        return configBean.toString();
    }
}
