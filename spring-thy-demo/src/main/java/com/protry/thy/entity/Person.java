package com.protry.thy.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author shaobin
 */
@Data
public class Person {

    private String name;
    private  Integer Score;
    private  Integer male;
    private Date birthday;

    public Person(String name, Integer score, Date birthday,Integer male) {
        this.name = name;
        Score = score;
        this.male = male;
        this.birthday = birthday;
    }
}
