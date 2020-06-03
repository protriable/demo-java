/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.controller;

import com.protry.entity.RoleDO;
import com.protry.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shaobin
 * @version : RoleController.java, v 0.1 2020年04月23日 9:50 下午 shaobin Exp $
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("getRole")
    @ResponseBody
    public RoleDO getRole() {
        System.out.println("request getRole..........");
        int id = 1;
        return roleService.getRole(id);
    }
}