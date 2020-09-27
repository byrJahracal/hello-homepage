package com.ripple.hellohomepage.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ConfigurationProperties(prefix="upload")
public class HelloController {
    private String imagePath;
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getImagePath(){
        return this.imagePath;
    }
    @GetMapping("/")
    public String root(){
        return "hello";
    }
}
