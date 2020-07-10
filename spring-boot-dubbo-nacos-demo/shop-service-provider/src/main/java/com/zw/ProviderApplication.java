package com.zw;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    //使用jar方式打包的启动方式
    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    public static void main(String[] args) throws InterruptedException{
        SpringApplication.run(ProviderApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }

}
