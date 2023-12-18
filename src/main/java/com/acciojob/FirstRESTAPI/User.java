package com.acciojob.FirstRESTAPI;

public class User {

    private int userId;//This will be unique for each user and will act as a key for our hashmap
    private String name;
    private int age;

    public User(){ //This is also mandatory

    }

    public User(String name, int age,int userId) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
