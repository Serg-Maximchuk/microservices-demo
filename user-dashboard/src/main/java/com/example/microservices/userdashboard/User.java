package com.example.microservices.userdashboard;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

