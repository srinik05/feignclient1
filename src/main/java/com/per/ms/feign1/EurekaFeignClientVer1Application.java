package com.per.ms.feign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaFeignClientVer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientVer1Application.class, args);
        System.out.println("Feign Client 1 Started.....!");

    }

}
