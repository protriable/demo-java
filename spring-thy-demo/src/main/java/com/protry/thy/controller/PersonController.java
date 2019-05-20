package com.protry.thy.controller;


import com.protry.thy.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shaobin
 */
@Controller
@RequestMapping("person")
public class PersonController {

    @RequestMapping("/test01")
    public String thymeleaf(ModelMap map){
        List<Person> test=new ArrayList<>();
        test.add(new Person("数学",10,new Date(),1));
        test.add(new Person("数学0001",70,new Date(),2));
        test.add(new Person("数学01",100,new Date(),3));
        map.put("test",test);
        return "back/import/test";
    }

}
