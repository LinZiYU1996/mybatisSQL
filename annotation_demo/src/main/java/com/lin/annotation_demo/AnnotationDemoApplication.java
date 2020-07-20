package com.lin.annotation_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.annotation_demo.mapper")
public class AnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationDemoApplication.class, args);
    }

}
