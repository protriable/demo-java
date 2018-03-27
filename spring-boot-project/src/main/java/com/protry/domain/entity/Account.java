package com.protry.domain.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author bshao
 */
@Data
@Entity
@Table(name = "t_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double money;
}
