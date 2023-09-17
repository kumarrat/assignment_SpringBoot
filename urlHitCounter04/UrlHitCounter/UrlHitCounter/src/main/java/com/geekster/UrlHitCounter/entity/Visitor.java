package com.geekster.UrlHitCounter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {

    private Integer visitorId;
    private String visitorName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;
    private double priceRange;
    private String visitorCategory;


    public Integer getVisitorId() {
        return visitorId;
    }

    public Object getVisitorCategory() {
        return visitorCategory;
    }
}
