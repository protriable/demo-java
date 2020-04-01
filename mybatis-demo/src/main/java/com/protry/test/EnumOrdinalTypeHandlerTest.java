/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

import com.protry.entity.User;
import com.protry.enums.Sex;
import com.protry.mapper.UserMapper;
import com.protry.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;

/**
 * @author shaobin
 * @version : EnumOrdinalTypeHandlerTest.java, v 0.1 2020年03月29日 7:08 下午 shaobin Exp $
 */
@Slf4j
public class EnumOrdinalTypeHandlerTest {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setUserName("张三");
            user.setBirthday(new Date());
            user.setEmail("123@qq.com");
            user.setMobile("12344534543");
            user.setNote("这是个提醒");
            user.setCnname("小张");
            user.setSex(Sex.FEMALE);
            mapper.insertUser(user);
            System.out.println("插入成功。id=" + user.getId());
            User mapperUser = mapper.getUser(2L);
            log.info("User={}", mapperUser);
            sqlSession.commit();
        } catch (Exception e) {
            log.error("异常 message={}", e.getMessage());
            e.printStackTrace();
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}