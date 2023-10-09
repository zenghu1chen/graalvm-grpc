package com.zenghu1chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zenghu1chen
 * @date 2023/10/09 16:00
 */
@SpringBootApplication
public class MyApplication {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(MyApplication.class, args);
        System.out.println("cost time：" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
