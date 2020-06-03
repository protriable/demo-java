/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service;

import com.protry.entity.RoleDO;
import org.springframework.stereotype.Service;


/**
 * @author shaobin
 * @version : RoleService.java, v 0.1 2020年04月28日 9:12 下午 shaobin Exp $
 */
@Service
public interface RoleService {


    RoleDO getRole(int id);
}