package cn.entelechy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GaeaSysConsumer80_Application {
    public static void main(String[] args) {
        SpringApplication.run(GaeaSysConsumer80_Application.class, args);
    }
}
