package com.sun3d.why.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常拦截器
 * Created by xiech on 2018/1/29 0029.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req,Exception e){
       e.printStackTrace();
       System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler");
    }
}
