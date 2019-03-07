package com.wwclr.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by wwclr on 2019/3/4.
 */
public class Student {
    @JsonIgnore
    private String userId;
    private String name;
    @JsonInclude
    private Integer age;

    public Student() {
    }

    public Student(String userId, String name, Integer age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
