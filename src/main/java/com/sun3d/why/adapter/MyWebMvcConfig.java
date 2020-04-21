package com.sun3d.why.adapter;

import com.sun3d.why.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by xiech on 2018/1/30 0030.
 */
/*
此注解标注在类上，相当于把该类作为Spring的xml配置文件中的<beans>,作用为:spring容器（应用上下文）
此外@bean 标记在方法上  相当于<bean> 作用为bean对象
*/
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter{
    /**
     * 静态资源配置注册
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //访问该路径下的静态资源要加why
        registry.addResourceHandler("/why/**").addResourceLocations("classpath:/why/");
        //使用外部目录
        registry.addResourceHandler("/api_files/**").addResourceLocations("file:D:/data/1.txt");
        super.addResourceHandlers(registry);
    }

    /**
     * 拦截器注册
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
