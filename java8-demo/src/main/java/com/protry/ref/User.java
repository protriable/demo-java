package com.protry.ref;

public class User {

    private String username;

    private String password;

    private String address;

    private int age;

    public User(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private User(String address) {
        this.address = address;
    }

    private String getFullInfo() {
        System.out.println(this.getUsername() + " : " + this.getPassword() + " : " + this.getAddress());
        return "success";
    }

    public String getInfoByPublic(String username) {
        this.username = username;
        System.out.println(this.getUsername() + " : " + this.getPassword() + " : " + this.getAddress());
        return "success";
    }

    public User() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
