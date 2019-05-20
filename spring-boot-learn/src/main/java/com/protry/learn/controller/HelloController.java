package com.protry.learn.controller;

import com.protry.learn.model.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shaobin
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }
}
