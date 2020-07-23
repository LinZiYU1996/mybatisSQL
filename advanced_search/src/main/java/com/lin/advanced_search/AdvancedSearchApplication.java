package com.lin.advanced_search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.advanced_search.mapper")
public class AdvancedSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedSearchApplication.class, args);
    }

}
