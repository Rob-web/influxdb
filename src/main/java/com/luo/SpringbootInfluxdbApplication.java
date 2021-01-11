package com.luo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.luo.mapper")
@SpringBootApplication(scanBasePackages = { "com.luo" })
public class SpringbootInfluxdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInfluxdbApplication.class, args);
    }

}
