package com.protry.shiro.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author mrava
 * 2018/3/6
 **/
@Data
@Entity
@Table(name = "sys_user")
public class SysUserPo implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "mail")
    private String mail;
    @Basic
    @Column(name = "password")
    @JsonIgnoreProperties
    private String password;
    @Basic
    @Column(name = "del")
    private Boolean del;
    @Basic
    @Column(name = "ip")
    private String ip;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "createDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Timestamp createDate;
    @Basic
    @Column(name = "head")
    private String head;
    @Basic
    @Column(name = "active")
    private Boolean active;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "bigHead")
    private String bigHead;

}
