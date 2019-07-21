package cn.entelechy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//开启服务监控
public class GaeaSys_Consumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(GaeaSys_Consumer_DashBoard_App.class, args);
    }
}
