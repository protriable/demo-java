package com.protry.city.service.impl;

import com.google.common.collect.Lists;
import com.protry.city.service.CityDataService;
import com.protry.city.util.XmlBuilder;
import com.protry.city.vo.City;
import com.protry.city.vo.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author protry
 */
@Service
public class CityDataServiceImpl implements CityDataService {

    @Override
    public List<City> listCity() {
        // 读取XML文件
        Resource resource = new ClassPathResource("citylist.xml");

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(resource.getInputStream(), "utf-8"));) {

            StringBuffer buffer = new StringBuffer();
            String line ;

            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }

            // XML转为Java对象
            CityList cityList = (CityList)XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());
            return cityList.getCityList();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lists.newArrayList();

    }

}
