/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.entity;

import com.protry.enums.Sex;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author shaobin
 * @version : User.java, v 0.1 2020年03月29日 6:24 下午 shaobin Exp $
 */
@Setter @Getter
public class User {

    private long id;

    private String userName;

    private String cnname;

    private Date birthday;
    private Sex     sex;
    private String email;
    private String mobile;
    private String note;


}