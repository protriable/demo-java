package com.protry.cal;

import com.protry.cal.entity.User;

public class HashCodeTestOne {

    public static void main(String[] args) {

        User user1 = new User("zhangsan",11,"aa");
        User user2 = new User("zhangsan",12,"bb");
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
