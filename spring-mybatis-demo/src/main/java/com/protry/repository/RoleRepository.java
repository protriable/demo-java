/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.repository;

import com.protry.entity.RoleDO;

/**
 * @author shaobin
 * @version : RoleRepository.java, v 0.1 2020年04月28日 9:16 下午 shaobin Exp $
 */
public interface RoleRepository {

    RoleDO getRole(int id);
}