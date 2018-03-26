package com.ajax.controller;

import com.ajax.entity.ResultBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author protry
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("get1")
    public ResultBean get1() {
        System.out.println("get1");
        return new ResultBean("get1 ok");
    }
}
