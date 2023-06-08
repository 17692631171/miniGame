package com.example.miniGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MinigameApplication {
    /**
     * 自定义配置文件路径
     * @param args
     */
    String addClassPath = "";
    public static void main(String[] args) {
        SpringApplication.run(MinigameApplication.class, args);
    }

}
