package com.protry.controller;

import com.protry.entity.User;
import com.protry.model.ReqData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String test(ReqData<User> reqData) {
        User us = reqData.getData();
        System.out.println(us);
        return "success";
    }

    @RequestMapping("test1")
    @ResponseBody
    public String test1() {
        return "success1";
    }
}
