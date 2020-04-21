package com.sun3d.why.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by xiech on 2018/1/31 0031.
 */
@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name = "allow",value = "192.168.3.250,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
        @WebInitParam(name="deny",value = "192.168.3.7"),
        @WebInitParam(name = "loginUsername",value = "root"),
        @WebInitParam(name = "loginPassword",value = "1234567"),
        @WebInitParam(name = "resetEnable",value = "false")
})
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID=1L;
}
