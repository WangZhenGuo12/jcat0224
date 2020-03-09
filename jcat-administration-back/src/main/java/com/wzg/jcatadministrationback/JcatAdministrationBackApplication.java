package com.wzg.jcatadministrationback;

        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzg.jcatadministrationback.dao")
public class JcatAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcatAdministrationBackApplication.class, args);
    }

}
