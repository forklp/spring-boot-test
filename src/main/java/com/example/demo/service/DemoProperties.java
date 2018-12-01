package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoProperties {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("${com.example.demo.name}")
    private String name;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Value("${com.example.demo.title}")
    private String title;

}
