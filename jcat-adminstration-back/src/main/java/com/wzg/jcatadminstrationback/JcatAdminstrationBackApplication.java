package com.wzg.jcatadminstrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.wzg.jcatadminstrationback.dao")
public class JcatAdminstrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcatAdminstrationBackApplication.class, args);
    }

}
