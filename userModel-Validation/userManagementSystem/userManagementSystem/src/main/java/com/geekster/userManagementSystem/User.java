package com.geekster.userManagementSystem;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.sql.Time;
import java.util.Date;

public class User {

    @NotNull(message = "id should not be null")
    private Integer userId;
    @NotNull(message = "userName should not be null")
    private String username;
    private Date dateOfBirth;
    @NotBlank(message = "userName should not be blank")
    private String email;
    @Size(min = 10, max = 10)
    private String phoneNumber;
    private Date date;
    private Time time;

    public User(Integer userId, String username, Date dateOfBirth, String email, String phoneNumber, Date date, Time time) {
        this.userId = userId;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
