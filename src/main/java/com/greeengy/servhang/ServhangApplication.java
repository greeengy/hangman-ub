package com.greeengy.servhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.greeengy.servhang")
@EnableAutoConfiguration
public class ServhangApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServhangApplication.class, args);
    }

}
