package cn.entelechy.controller;

import cn.entelechy.service.loginClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController_Consumer {

    @Autowired
    private  loginClientService loginClientService;

    @RequestMapping("/consumer/login/hello")
    public String hello(){
        return loginClientService.hello();
    }
    @RequestMapping("/consumer/login/add")
    public String add(){
        return loginClientService.add();
    }
    @RequestMapping("/consumer/login/update")
    public String update(){
        return loginClientService.update();
    }
    @RequestMapping("/consumer/login/tologin")
    public String tologin(){
    return loginClientService.tologin();
    }
    @RequestMapping("/consumer/login/noAuth")
    public String noAuth(){
        return loginClientService.noAuth();
    }
    @RequestMapping("/consumer/login/testThymeleaf")
    public String testThymeleaf(){
        return loginClientService.testThymeleaf(); }
    @RequestMapping(value = "/consumer/login/login/{account_name}/{account_pwd}")
    public String login(@PathVariable("account_name") String account_name, @PathVariable("account_pwd") String account_pwd){
        return loginClientService.login(account_name,account_pwd);
    }
}
