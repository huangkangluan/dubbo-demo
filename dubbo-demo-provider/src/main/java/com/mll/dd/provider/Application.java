package com.mll.dd.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * Created by rocky on 2015/11/27.
 */
@Configuration
@ComponentScan(basePackages = "com.mll.dd")
@EnableAutoConfiguration
@ImportResource(value = "classpath:dubbo.xml")
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class , args);
        new CountDownLatch(1).await();
    }

}
