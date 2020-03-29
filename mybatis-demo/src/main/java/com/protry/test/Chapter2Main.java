/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

import com.protry.entity.Role;
import com.protry.mapper.RoleMapper;
import com.protry.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

/**
 * @author shaobin
 * @version : Chapter2Main.java, v 0.1 2020年03月28日 9:53 下午 shaobin Exp $
 */
@Slf4j
public class Chapter2Main {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role(2, "lisi", 18, "good");
            int id = mapper.insertRole(role);
            log.info("insert success id={}, role={}", id, role);
            int deleteID = mapper.deleteRole(1L);
            log.info("delete success id={}", deleteID);
            sqlSession.commit();
        } catch (Exception e) {
            log.error("error ={}", e.getMessage());
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
    }
}