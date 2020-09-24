package com.ripple.hellohomepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="upload")
public class HelloController {
    private String imagePath;
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getImagePath(){
        return this.imagePath;
    }
    @GetMapping("/1")
    public String root(){
        return imagePath+"OK";
    }
}
