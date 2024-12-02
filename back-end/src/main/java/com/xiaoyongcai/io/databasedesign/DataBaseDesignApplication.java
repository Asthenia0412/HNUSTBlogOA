package com.xiaoyongcai.io.databasedesign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class })
public class  DataBaseDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataBaseDesignApplication.class, args);
    }

}
