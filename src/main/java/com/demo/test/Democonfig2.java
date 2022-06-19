package com.demo.test;

import org.springframework.stereotype.Component;

@Component
public class Democonfig2 {
    private String name;

    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
