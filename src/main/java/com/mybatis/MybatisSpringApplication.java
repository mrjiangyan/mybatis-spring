package com.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("beans.xml")
public class MybatisSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisSpringApplication.class, args);
    }


}
