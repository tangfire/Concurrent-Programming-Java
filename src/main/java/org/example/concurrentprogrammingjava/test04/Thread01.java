package org.example.concurrentprogrammingjava.test04;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Thread01 {
    @MyAsync
    public void asyncLog(){
        try {
            log.info("目标方法正在执行...阻塞3s");
            Thread.sleep(3000);
            log.info("<2>");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

