package com.mayikt.entity;


public class UserEntity {
    private String userName;
    private Integer age;
    private Integer id;
    public UserEntity(Integer id,String userName, Integer age) {
        this.userName = userName;
        this.age = age;
        this.id=id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
