/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service.impl;

import com.protry.entity.RoleDO;
import com.protry.repository.RoleRepository;
import com.protry.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.Role;

/**
 * @author shaobin
 * @version : RoleServiceImpl.java, v 0.1 2020年04月28日 9:12 下午 shaobin Exp $
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleDO getRole(int id) {
        return roleRepository.getRole(id);
    }
}