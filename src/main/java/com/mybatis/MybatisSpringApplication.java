package com.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource("beans.xml")
@EnableTransactionManagement
public class MybatisSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisSpringApplication.class, args);
    }


}
