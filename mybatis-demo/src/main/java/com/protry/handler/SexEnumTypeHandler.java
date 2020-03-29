/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.handler;

import com.protry.enums.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shaobin
 * @version : SexEnumTypeHandler.java, v 0.1 2020年03月29日 8:59 下午 shaobin Exp $
 */
public class SexEnumTypeHandler implements TypeHandler<Sex> {

    @Override
    public void setParameter(PreparedStatement ps, int index, Sex sex, JdbcType jdbcType) throws SQLException {
        ps.setInt(index, sex.getId());
    }

    @Override
    public Sex getResult(ResultSet rs, String name) throws SQLException {
        int id = rs.getInt(name);
        return Sex.getSex(id);
    }

    @Override
    public Sex getResult(ResultSet rs, int index) throws SQLException {
        int id = rs.getInt(index);
        return Sex.getSex(id);
    }

    @Override
    public Sex getResult(CallableStatement cs, int index) throws SQLException {
        int id = cs.getInt(index);
        return Sex.getSex(id);
    }
}