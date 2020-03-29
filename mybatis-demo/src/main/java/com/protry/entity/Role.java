/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.entity;

import lombok.*;
import org.apache.ibatis.type.Alias;

/**
 * @author shaobin
 * @version : Role.java, v 0.1 2020年03月23日 9:37 下午 shaobin Exp $
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("role") //这个注解定义(如果不加注解,默认就是第一个字母小写的形式)+配置文件中的package定义 == 配置文件中对单个类的别名定义
public class Role {

    private long id;
    private String name;
    private int age;
    private String note;


}