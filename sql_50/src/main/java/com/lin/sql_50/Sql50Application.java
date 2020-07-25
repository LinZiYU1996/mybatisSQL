package com.lin.sql_50;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.sql_50.mapper")
public class Sql50Application {

    public static void main(String[] args) {
        SpringApplication.run(Sql50Application.class, args);
    }

}
