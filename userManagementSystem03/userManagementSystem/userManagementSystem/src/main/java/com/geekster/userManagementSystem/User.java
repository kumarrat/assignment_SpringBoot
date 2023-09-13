package com.geekster.userManagementSystem;

public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private Integer number;

    public User(Integer userId, String name, String userName, String address, Integer number) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.number = number;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
