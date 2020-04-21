package com.sun3d.why.shiro;

import java.util.LinkedHashMap;
import java.util.Map;


import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

/**
 * 注入shiro factory 和securityManager
 * Created by xiech on 2018/2/6 0006.
 */
@Configuration
public class ShiroConfiguration {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        System.out.println("ShiroConfiguration.shirFilter()");
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //必须设置securityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //拦截器

        Map<String,String> filterChainDefinitionMap=new LinkedHashMap<String, String>();

        //配置退出过滤器，其中的具体的退出代码shiro已经帮我们实现了
        filterChainDefinitionMap.put("/logout","logout");

        //配置记住我或认证通过可以访问的地址
        filterChainDefinitionMap.put("/index", "user");
        filterChainDefinitionMap.put("/", "user");

        //<!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterChainDefinitionMap.put("/**","authc");
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/index");
       //未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;

    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //设置自己的realm
        securityManager.setRealm(myShiroRealm());
        //注入缓存管理器;
        securityManager.setCacheManager(ehCacheManager());
        //注入记住我管理器;
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    /**
     *  * 身份认证realm;
     * (这个需要自己写，账号密码校验；权限等
     * @return
     */
    @Bean
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm myShiroRealm=new MyShiroRealm();
        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return myShiroRealm;
    }

    /**
     * 凭证匹配器
     * （由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了
     * 所以我们需要修改下doGetAuthenticationInfo中的代码;
     * ）
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(1);
        return hashedCredentialsMatcher;
    }

    /**
     * 开启shiro aop注解支持.
     * 使用代理方式;所以需要开启代码支持;
     * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
      AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor=new AuthorizationAttributeSourceAdvisor();
      authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
      return authorizationAttributeSourceAdvisor;
    }

    /**
     * shiro缓存管理器;
     * 需要注入对应的其它的实体类中：
     * 1、安全管理器：securityManager
     * 可见securityManager是整个shiro的核心；
     * @return
     */
    @Bean
    public EhCacheManager ehCacheManager(){
        System.out.println("ShiroConfiguration.getEhCacheManager()");
        EhCacheManager cacheManager=new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:conf/ehcache-shiro.xml");
        return cacheManager;
    }

    /**
     * cookie对象
     * @return
     */
    @Bean
    public SimpleCookie rememberMeCookie(){
        System.out.println("ShiroConfiguration.rememberMeCookie()");
        SimpleCookie simpleCookie=new SimpleCookie("rememberMe");
        simpleCookie.setMaxAge(259200);
        return simpleCookie;
    }

    /**
     * cookie管理对象;
     * @return
     */
    @Bean
    public CookieRememberMeManager rememberMeManager(){
        System.out.println("ShiroConfiguration.rememberMeManager()");
        CookieRememberMeManager cookieRememberMeManager=new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
         return cookieRememberMeManager;
        }
}
