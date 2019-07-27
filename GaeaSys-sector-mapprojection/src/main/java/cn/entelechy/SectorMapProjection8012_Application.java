package cn.entelechy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class SectorMapProjection8012_Application {
    public static void main(String[] args) {
        SpringApplication.run(SectorMapProjection8012_Application.class,args);
    }
}
