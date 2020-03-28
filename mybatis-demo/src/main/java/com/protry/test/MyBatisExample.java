/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

import com.protry.entity.Role;
import com.protry.mapper.RoleMapper;
import com.protry.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author shaobin
 * @version : MyBatisExample.java, v 0.1 2020年03月24日 9:17 下午 shaobin Exp $
 */
public class MyBatisExample {

    public static void main(String[] args) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1);
            System.out.println("roleName=" + role.getName());
        }
    }
}