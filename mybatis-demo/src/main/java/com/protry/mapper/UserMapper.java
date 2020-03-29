/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.mapper;

import com.protry.entity.User;

/**
 * @author shaobin
 * @version : UserMapper.java, v 0.1 2020年03月29日 6:26 下午 shaobin Exp $
 */
public interface UserMapper {

    User getUser(Long id);
    int insertUser(User user);
}