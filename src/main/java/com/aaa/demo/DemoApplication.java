package com.aaa.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aaa.demo.mapper") // 扫描这个包下的所有 Mapper 接口
public class DemoApplication {
        // 这里当成整个项目启动的入口即可
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
