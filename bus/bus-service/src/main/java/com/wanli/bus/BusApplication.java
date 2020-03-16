package com.wanli.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BusApplication {
    @Value("${name}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BusApplication.class, args); }
}
