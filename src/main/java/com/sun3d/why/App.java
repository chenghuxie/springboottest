package com.sun3d.why;

import com.sun3d.why.proconfig.MyProSettings;
import com.sun3d.why.proconfig.MyProSettingsOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;



import javax.servlet.MultipartConfigElement;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@SpringBootApplication
//这个就是扫描相应的servlet包 注解方式
@ServletComponentScan
@EnableConfigurationProperties({MyProSettings.class, MyProSettingsOut.class})
/*@EnableCaching*///redis缓存
public class App /*extends SpringBootServletInitializer*/ {
    /**
     *整合jsp   继承SpringBootServletInitializer
     */
   /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }*/

    /**
     * 注册 Servlet. 不需要添加注解： @ServletComponentScan
     * @return
     */
   /* @Bean
    public ServletRegistrationBean MyServlet(){
        return new ServletRegistrationBean(new MyServlet(),"/myServlet*//*");
    }*/
    public static void main(String [] agrs){
        SpringApplication.run(App.class,agrs);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory=new MultipartConfigFactory();
        factory.setMaxFileSize("2MB");
        factory.setMaxRequestSize("4MB");
        return factory.createMultipartConfig();
  }

    /**
     * 重新配置RedisCacheManager
     * @param rd
     */
   /* @Bean
    public void configRedisCacheManger(RedisCacheManager rd){
        rd.setDefaultExpiration(100L);
    }*/

}
