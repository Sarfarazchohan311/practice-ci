package com.sarfaraz.bean;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer idNumber;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(Integer idNumber, String name, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.address = address;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
