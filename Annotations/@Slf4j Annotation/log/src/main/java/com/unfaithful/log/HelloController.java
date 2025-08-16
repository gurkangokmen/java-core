package com.unfaithful.log;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String helloMessage() {
        log.info("Hello, World!");
        return "Hello, World!";
    }
}
