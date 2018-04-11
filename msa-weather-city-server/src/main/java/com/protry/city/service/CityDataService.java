package com.protry.city.service;

import com.protry.city.vo.City;

import java.util.List;

/**
 * @author protry
 */
public interface CityDataService {

    /**
     * 获取City列表
     * @return
     * @throws Exception
     */
    List<City> listCity();
}
