package org.example.concurrentprogrammingjava.test01.example01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service {
    @Autowired
    private Thread07 thread07;

    @RequestMapping("test")
    public String test() {
        log.info("<1>");
        thread07.asyncLog();
        log.info("<3>");
        return "test";
    }


}
