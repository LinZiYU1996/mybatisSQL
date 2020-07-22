package com.lin.dynamic_sql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.dynamic_sql.mapper")
public class DynamicSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicSqlApplication.class, args);
    }

}
