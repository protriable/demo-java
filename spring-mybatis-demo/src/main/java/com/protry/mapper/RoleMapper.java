/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.mapper;

import com.protry.entity.RoleDO;
import org.springframework.stereotype.Component;

/**
 * @author shaobin
 * @version : RoleMapper.java, v 0.1 2020年04月28日 9:15 下午 shaobin Exp $
 */
@Component
public interface RoleMapper {


    RoleDO getRole(int id);
}