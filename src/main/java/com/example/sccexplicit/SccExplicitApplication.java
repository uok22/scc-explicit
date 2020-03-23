package com.example.sccexplicit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SccExplicitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SccExplicitApplication.class, args);
    }

    @GetMapping("/my-context-path/url")
    public String getIt() {
        System.out.println("-------------------   my rest controller ");
        return "hello";
    }

}
