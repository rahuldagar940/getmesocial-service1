package com.example.getmesocialservice1.model;

public class User {
    private String name;
    private String address;
    private int age;
    private String profilePicURL;

    public User(String name, String address, int age, String profilePicURL) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.profilePicURL = profilePicURL;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }
}
