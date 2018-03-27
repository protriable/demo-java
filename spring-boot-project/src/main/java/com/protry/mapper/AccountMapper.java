package com.protry.mapper;

import com.protry.domain.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bshao
 */
@Repository
public interface AccountMapper {

    User getUserById(Integer id);

    List<User> getUserList();

    int update(@Param("id") Integer id, @Param("user") User user);

    int delete(Integer id);
}
