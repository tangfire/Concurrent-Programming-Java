package org.example.concurrentprogrammingjava.test04;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
@Aspect 用来类上,代表这个类是一个切面
 @Before 用在方法上代表这个方法是一个前置通知方法
 @After 用在方法上代表这个方法是一个后置通知方法 @Around 用在方法上代表这个方法是一个环绕的方法
 @Around 用在方法上代表这个方法是一个环绕的方法
 **/

@Component
@Aspect
@Slf4j
public class ExtThreadAsyncAop {

    @Around(value ="@annotation(org.example.concurrentprogrammingjava.test04.MyAsync)")
    public Object around(ProceedingJoinPoint joinPoint){
        try {
            log.info(">环绕通知开始执行<");
            new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    joinPoint.proceed();//目标方法
                }
            }).start();
            log.info(">环绕通知结束执行<");
            return "环绕通知";
        }catch (Throwable throwable){
            return "系统错误";
        }
    }

}

