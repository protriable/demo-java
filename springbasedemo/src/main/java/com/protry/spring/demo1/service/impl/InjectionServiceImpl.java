package com.protry.spring.demo1.service.impl;

import com.protry.spring.demo1.dao.InjectionDAO;
import com.protry.spring.demo1.service.InjectionService;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;


    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
