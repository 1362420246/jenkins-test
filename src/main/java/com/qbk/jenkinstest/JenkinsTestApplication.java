package com.qbk.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

    @GetMapping("/")
    public String test(){
        return "hello jenkins ，奥里给";
    }

    @GetMapping("/get")
    public String get(){
        return "get";
    }
}
