package com.lx.mallchat.common;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author lx
 * @date 2024/07/18
 */
@SpringBootApplication(scanBasePackages = {"com.lx.mallchat"})
@MapperScan("com.lx.mallchat.**.mapper")
public class MallchatCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallchatCustomApplication.class,args);
    }

}