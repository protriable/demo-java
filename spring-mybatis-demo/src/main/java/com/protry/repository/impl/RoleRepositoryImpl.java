/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.repository.impl;

import com.protry.entity.RoleDO;
import com.protry.mapper.RoleMapper;
import com.protry.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shaobin
 * @version : RoleRepositoryImpl.java, v 0.1 2020年04月28日 9:16 下午 shaobin Exp $
 */
@Component
public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleDO getRole(int id) {
        return roleMapper.getRole(id);
    }
}