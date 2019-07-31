package cn.entelechy.configbeans;

import cn.entelechy.shiro.DatabaseRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro配置类
 */
@Configuration
public class ShiroConfiguration {
    /***
     * 创建ShiroFilterFactoryBean
     * @param
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFiltenFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);//通过securityManager去查找shiroFilterFactoryBean
        //添加Shiro内置过滤器
        /**
         * Shiro内置过滤器，可以实现权限相关的拦截器
         * 常用的过滤器：
         *  anon:无需认证(登录)可以访问*  authc:必须认证才可以访问
         *  authc:必须认证才可以访问
         *  user:  如果使用rememberMe的功能可以直接访问
         *  perms:该资源必须得到资源权限才可以访问
         *  role:该资源必须得到角色权限才可以访问
         */
        Map<String, String> filterMap = new LinkedHashMap<String, String>();
        /*filterMap.put("/tologin","anon");*/
        /*filterMap.put("/testThymeleaf","anon");*/
        filterMap.put("/*","anon");
        //授权拦截器
        //当授权拦截后，shiro会跳转到未授权页面
        filterMap.put("/add","perms[user:add]");
        filterMap.put("/update","perms[user:update]");//跟数据库一致
        /*filterMap.put("/*","authc");*/
        /*filterMap.put("/add","authc");
        filterMap.put("/update","authc");*/
        //设置未授权页面
        /*shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");*/
        //修改调整的登录页面
        /*shiroFilterFactoryBean.setLoginUrl("/tologin");*/
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }
    /**
     * 创建DefaultWebSecurityManager
     * @return
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") DatabaseRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);//用@Qualifier找到它
        return securityManager;
    }
    /**
     * 创建Realm
     * @return
     */
    @Bean(name = "userRealm")
    public DatabaseRealm getRealm() {
        return new DatabaseRealm();
    }
    /**
     * 配置ShiroDialect，用于thymeleaf和shiro标签配合使用
     *
     */
    /*@Bean
    public ShiroDialect getShiroDialect(){

        return new ShiroDialect();
    }*/
}
