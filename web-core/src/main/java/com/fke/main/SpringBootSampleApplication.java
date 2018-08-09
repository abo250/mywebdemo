package com.fke.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fke.controller")
public class SpringBootSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleApplication.class,args);
    }
}
