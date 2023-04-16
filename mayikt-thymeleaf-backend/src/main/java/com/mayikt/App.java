package com.mayikt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;

@SpringBootApplication
@MapperScan("com.mayikt.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}

