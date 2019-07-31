package cn.entelechy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("HelloController.hello()");
        return "登录成功！";
    }
    @RequestMapping("/add")
    public String add() {
        return "/user/add";
    }
    @RequestMapping("/update")
    public String update() {
        return "/user/update";
    }
    @RequestMapping("/tologin")
    public String tologin() {
        return "/login";
    }
    @RequestMapping("/noAuth")
    public String noAuth(){
        return "/noAuth";
    }
    /**
     * 测试thyme leaf
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model) {
        //把数据存进model
        model.addAttribute("name","初始springboot");
        //返回test.html
        return "test";
    }
    /**
     * 登录逻辑处理
     */
    @RequestMapping("/login")
    public String login( String account_name,String account_pwd){
        System.out.println("name="+account_name);
/**
 * 使用Shiro编写认证操作
 */
//1.获取Subject
        Subject subject= SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(account_name,account_pwd);
        //3.执行登录方法
        try{
            subject.login(token);
            return "redirect:/hello";
        }catch (UnknownAccountException e){
            //e.printStackTrace();
            //登录失败：用户名不存在
            System.out.println("用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e){
            //e.printStackTrace();
            //登录失败：密码错误
            System.out.println("密码错误");
            return "login";
        }
    }
}
