package com.example.minigame.base;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * controller层日志切面类
 */
@Aspect
@Component
public class LoggerAspect {

    private static final Logger log = LoggerFactory.getLogger(ResultException.class);
    //连接点
    @Pointcut(value = "execution(* com.example..*.*(..))")

    public void logPointcut() {
    }

    //记录程序运行时间
    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    //前置通知
    @Before("logPointcut()")
    public void BeforLogger(JoinPoint joinPoint) {
        log.info("--------前置通知日志输出--------");
        //开始时间
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //获取请求url
        log.info("url: " + request.getRequestURL());
        //获取method
        log.info("method: " + request.getMethod());
        //获取请求参数
        log.info("args: " + Arrays.toString(joinPoint.getArgs()));


    }


    //后置通知
    @AfterReturning(value = "logPointcut()", returning = "result")
    public void AfterReturningLogger(Object result) {
        log.info("--------后置通知日志输出--------");
        //返回值
        log.info("Result: " + result.toString());
        //程序运时间(毫秒)
        log.info("用时: " + (System.currentTimeMillis() - startTime.get()) + " ms");

        startTime.remove();
    }

    //异常通知
    @AfterThrowing(value = "logPointcut()")
    public void ThrowingLogger() {
        log.error("--------异常通知日志输出--------");
        log.error("ErrorMessage：请根据异常产生时间前往异常日志查看相关信息");
    }

}