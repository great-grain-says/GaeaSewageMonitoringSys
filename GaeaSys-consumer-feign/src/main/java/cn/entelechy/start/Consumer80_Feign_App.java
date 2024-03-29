package cn.entelechy.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.entelechy"})
@ComponentScan("cn.entelechy")
public class Consumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_Feign_App.class, args);
    }
}
