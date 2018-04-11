package com.protry.collection.service;

/**
 * @author protry
 */
public interface WeatherDataCollectionService {

    /**
     * 同步天气数据
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
