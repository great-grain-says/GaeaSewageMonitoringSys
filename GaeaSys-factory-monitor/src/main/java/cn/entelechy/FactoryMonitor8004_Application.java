package cn.entelechy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableScheduling
public class FactoryMonitor8004_Application {
    public static void main(String[] args) {
        SpringApplication.run(FactoryMonitor8004_Application.class, args);
    }
}
