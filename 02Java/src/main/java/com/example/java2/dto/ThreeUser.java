package com.example.java2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeUser {
    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;


    public ThreeUser() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    //생성자 오버로딩
    public ThreeUser(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ThreeUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
