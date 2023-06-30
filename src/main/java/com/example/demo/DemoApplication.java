package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("master-1");
        System.out.println("master-2");
        System.out.println("master-3");
        System.out.println("master-3");
        System.out.println("master-3");
    }

}
