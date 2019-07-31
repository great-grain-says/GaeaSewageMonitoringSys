package cn.entelechy.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class loginClientServiceFallbackFactory implements FallbackFactory<loginClientService> {
    @Override
    public loginClientService create(Throwable throwable) {
        return new loginClientService() {
            @Override
            public String hello() {
                return "没找到";
            }

            @Override
            public String testThymeleaf() {
                return "出现异常";
            }

            @Override
            public String add() {
                return "出现异常1";
            }

            @Override
            public String update() {
                return "出现异常2";
            }

            @Override
            public String tologin() {
                return "出现异常3";
            }

            @Override
            public String noAuth() {
                return "出现异常4";
            }

            @Override
            public String login(String account_name, String account_pwd) {
                return "出现异常4";
            }

        };
    }
}
