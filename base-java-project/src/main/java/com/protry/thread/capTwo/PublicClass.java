
package com.protry.thread.capTwo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shaobin
 * @version : PublicClass.java, v 0.1 2020年06月23日 8:58 下午 shaobin Exp $
 */
public class PublicClass {

    private String username;
    private String password;

    @Getter @Setter
    class PrivateClass{
        private String age;
        private String address;

        public void printPublicProperty() {
            System.out.println("username=" + username + ",password=" + password);
        }
    }

    static class PrivateClassTwo {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}