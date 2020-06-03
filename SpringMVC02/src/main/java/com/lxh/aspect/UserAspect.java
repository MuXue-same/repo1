package com.lxh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {
    @Before("execution(* com.lxh.controller.*.*(..))")
    public void befor(){
        System.out.println("前置增强");
    }
}
