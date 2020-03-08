package com.sdulwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注一个主程序，说明这是一个Spring Boot应用
 */
@SpringBootApplication

public class HelloWorldMainApplication {
    public static void main(String[] args) {

        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
