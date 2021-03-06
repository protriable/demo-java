/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.mapper;

import com.protry.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shaobin
 * @version : RoleMapper.java, v 0.1 2020年03月23日 9:43 下午 shaobin Exp $
 */
public interface RoleMapper {

    Role getRole(long id);

    Role getRoleById(long id);

    int insertRole(Role role);

    int deleteRole(long id);

    int updateRole(Role role);

    /**
     * 使用注解方式实现
     * @param id 主键
     * @return 返回结果
     */
    @Select("select * from t_role where id = #{id}")
    Role getRole2(long id);

    Role findRolesByName(String name);

    Role findRoles(Role role);

    Role getRoleTest(String type);

    List<Role> findRole(@Param("name") String name, @Param("note") String note);
}