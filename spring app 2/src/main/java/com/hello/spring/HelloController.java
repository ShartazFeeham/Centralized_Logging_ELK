package com.hello.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public String hello() {
        Random random = new Random();
        int requestId = random.nextInt();

        for (int i = 2; i < random.nextInt(10); i++) {
            fun1(requestId);
        }
        for (int i = 2; i < random.nextInt(10); i++) {
            fun2(requestId);
        }
        for (int i = 2; i < random.nextInt(10); i++) {
            fun3(requestId);
        }
        for (int i = 2; i < random.nextInt(10); i++) {
            fun4(requestId);
        }

        return "Different logs are added";
    }
    public void fun1(int requestId) {
        log.info("Function 1 executed, info log added. Request ID: {}", requestId);
    }

    public void fun2(int requestId) {
        log.debug("Function 2 executed, debug log added. Request ID: {}", requestId);
    }

    public void fun3(int requestId) {
        log.error("Function 3 executed, error log added. Request ID: {}", requestId);
    }

    public void fun4(int requestId) {
        log.warn("Function 4 executed, warn log added. Request ID: {}", requestId);
    }
}
