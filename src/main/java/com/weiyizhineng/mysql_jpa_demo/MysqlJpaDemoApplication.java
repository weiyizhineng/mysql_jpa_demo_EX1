package com.weiyizhineng.mysql_jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlJpaDemoApplication {

    public static void main(String[] args) {

        System.out.println("第一个JPA演示程序！");

        SpringApplication.run(MysqlJpaDemoApplication.class, args);
    }

}
//$ curl 'localhost:8080/demo/all'