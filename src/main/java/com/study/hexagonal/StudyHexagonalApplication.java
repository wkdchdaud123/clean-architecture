package com.study.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyHexagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyHexagonalApplication.class, args);
    }

    @GetMapping
    public String test(){
        return "test";
    }

}
