package com.protry.report.controller;

import com.protry.report.service.WeatherReportService;
import com.protry.report.vo.CityList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author protry
 */
@RestController
@RequestMapping("report")
public class WeatherReportController {

    //TODO 改为由城市数据API微服务来提供服务

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getWeatherByCityId(@PathVariable("cityId") String cityId, Model model) {

        ModelAndView modelAndView = new ModelAndView("weather/report","reportModel", model);
        model.addAttribute("title","天气预报");
        model.addAttribute("cityId",cityId);
        model.addAttribute("cityList",new CityList());
        model.addAttribute("report", weatherReportService.getWeatherByCityId(cityId));
        return modelAndView;
    }
}
