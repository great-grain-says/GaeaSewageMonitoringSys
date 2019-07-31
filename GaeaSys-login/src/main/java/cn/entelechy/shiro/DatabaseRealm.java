package cn.entelechy.shiro;

import cn.entelechy.Service.UserService;
import cn.entelechy.entities.Account;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseRealm extends AuthorizingRealm {
    //注入业务
    @Autowired
    private UserService userService;
    /**
     * 执行授权逻辑
     * @param
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权逻辑");
        //给资源进行授权
        SimpleAuthorizationInfo info= new SimpleAuthorizationInfo();
        //添加资源授权字符串
        //info.addStringPermission("user:add");
        //到数据库查询当前登录用户授权字符串
        Subject subject= SecurityUtils.getSubject();
        Account user= (Account) subject.getPrincipal();
        Account dbUser= userService.findById(user.getId());
        info.addStringPermission(dbUser.getAccount_perms());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        /*//假设数据库的用户名和密码
        String name="eric";
        String password="123456";
        //编写shiro判断逻辑，半段用户名和密码*/
        //1.判断用户名
        UsernamePasswordToken token=(UsernamePasswordToken)arg0;
        Account user= userService.findByname(token.getUsername());
        if (user==null){
            //用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }
        //2.判断密码

        return new SimpleAuthenticationInfo(user,user.getAccount_pwd(),"");
    }
}
