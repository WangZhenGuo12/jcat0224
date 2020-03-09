package com.wzg.jcatstoreback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzg.jcatstoreback.dao")
public class JcatStoreBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcatStoreBackApplication.class, args);
    }

}
