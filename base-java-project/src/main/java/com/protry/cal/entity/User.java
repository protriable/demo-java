package com.protry.cal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * 没有复写hashcode方法，请勿随意使用
 */
@Deprecated
public class User {

    private String name;

    private Integer age;

    private String address;


    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }

        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return name.equals(user.name);
    }
}
