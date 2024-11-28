package org.example.concurrentprogrammingjava.test04;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 阶段案例：手写@Async异步注解
 * 思路：通过Aop拦截只要在我们方法上有使用到我们自己定义的异步注解，我们就单独的开启一个异步线程去执行目标方法。
 */
@RestController
@Slf4j
public class Service01 {
    @Autowired
    private Thread01 thread01;
    @RequestMapping("testMyAsync")
    public String Test(){
        log.info("<1>");
        thread01.asyncLog();
        log.info("<3>");
        return "test";
    }

}
