package com.protry.collection.job;

import com.google.common.collect.Lists;
import com.protry.collection.service.WeatherDataCollectionService;
import com.protry.collection.vo.City;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * @author protry
 */
public class WeatherDataSyncJob extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        logger.info(" Start Weather Data Sync Job");
        //获取城市列表
        //TODO 后期会改为城市数据API服务提供调用
        City city1 = new City();
        city1.setCityId("101281804");
        List<City> cityList = Lists.newArrayList(city1);

        //遍历城市id获取天气
        for (City city : cityList) {
            logger.info("Sync Weather Data By CityId:" + city.getCityId());
            weatherDataCollectionService.syncDataByCityId(city.getCityId());
        }
        logger.info(" End Weather Data Sync Job");
    }
}
