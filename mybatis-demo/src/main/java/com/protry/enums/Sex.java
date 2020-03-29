/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.enums;

/**
 * @author shaobin
 * @version : Sex.java, v 0.1 2020年03月29日 6:16 下午 shaobin Exp $
 */
public enum Sex {

    MALE(1,"男"), FEMALE(2,"女");

    private int id;
    private String name;

    Sex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Sex getSex(int id) {
        if (1 == id) {
            return MALE;
        } else if (2 == id) {
            return FEMALE;
        }
        return null;
    }
}