package org.lanqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.lanqiao.mapper")
@SpringBootApplication
public class MenglixingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenglixingApplication.class, args);
    }

    /*
    * 有@MapperScan("org.lanqiao.mapper")注解以后，application-dev.yml文件里的mapper-locations: classpath : org.lanqiao.mapper/*Mapper.xml要删除
    * */

}
