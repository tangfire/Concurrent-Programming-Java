package org.example.concurrentprogrammingjava.test01.example01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Spring中的@Async创建
 * step1:在启动类中开启异步注解
 * step2:在当前方法加上@Async
 * step3:在Service验证测试
 */
@Component
@Slf4j
public class Thread07 {

    @Async
    public void asyncLog(){
        try{
            Thread.sleep(3000);
            log.info("<2>");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
