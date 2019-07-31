package cn.entelechy.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "GAEASYS-LOGIN",fallbackFactory = loginClientServiceFallbackFactory.class)
public interface loginClientService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();
    @RequestMapping(value = "/testThymeleaf")
    String testThymeleaf();
    @RequestMapping(value = "/add")
    String add();
    @RequestMapping(value = "/update")
    String update();
    @RequestMapping(value = "/tologin")
    String tologin();
    @RequestMapping(value = "/noAuth")
    String noAuth();
    @RequestMapping(value = "/login")
    String login( String account_name,String account_pwd);
}
