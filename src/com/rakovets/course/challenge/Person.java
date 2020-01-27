package com.rakovets.course.challenge;

public class Person {
    private int phoneNumber;
    private String name;
    private String surName;

    Person(int phoneNumber, String name, String surName){
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surName = surName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}