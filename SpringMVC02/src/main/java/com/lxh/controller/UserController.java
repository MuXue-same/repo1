package com.lxh.controller;

import com.lxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class UserController  {
    @Autowired
    private UserService userService;
    public void setUserService(UserService userService){
        this.userService=userService;
    }

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/aaa")
    @ResponseBody
    public void aaa(HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        System.out.println("contro");
        WebApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext parent = app.getParent();

        UserController bean = app.getBean(UserController.class);
        System.out.println(this);
        System.out.println(bean);
        System.out.println("app  "+app);
        System.out.println(context);


        userService.aaaa("2");
    }


}
