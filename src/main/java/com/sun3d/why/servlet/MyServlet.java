package com.sun3d.why.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Web开发使用 Controller 基本上可以完成大部分需求，但是我们还可能会用到 Servlet、Filter、Listener、
 Interceptor 等等。
 当使用Spring-Boot时，嵌入式Servlet容器通过扫描注解的方式注册Servlet、Filter和Servlet规范的所有监听器
 （如HttpSessionListener监听器）。
 Spring boot 的主 Servlet 为 DispatcherServlet，其默认的url-pattern为“/”。也许我们在应用中还需要定义更多的
 Servlet，该如何使用SpringBoot来完成呢？
 在spring boot中添加自己的Servlet有两种方法，代码注册Servlet和注解自动注册（Filter和Listener也是如此）。
 一、代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控
 制。
 也可以通过实现 ServletContextInitializer 接口直接注册。
 二、在 SpringBootApplication 上使用@ServletComponentScan注解后，Servlet、Filter、Listener 可以直接通过
 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码
 * Created by xiech on 2018/2/1 0001.
 */
@WebServlet(urlPatterns = "/myServlet/*",description = "servlet的说明")
public class MyServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
         System.out.println(">>>>>>>>>>>>>>>doGet()<<<<<<<<<<<<<");
          doPost(request,response);
     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>这是：MyServlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
