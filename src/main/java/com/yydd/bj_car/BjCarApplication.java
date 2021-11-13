package com.yydd.bj_car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.yydd.bj_car.dao")
//@ImportResource(locations = {"classpath:spring-task.xml"})
public class BjCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BjCarApplication.class, args);
    }

}
