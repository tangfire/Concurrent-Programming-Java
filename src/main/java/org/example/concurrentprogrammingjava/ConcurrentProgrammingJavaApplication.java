package org.example.concurrentprogrammingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ConcurrentProgrammingJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcurrentProgrammingJavaApplication.class, args);
    }

}
