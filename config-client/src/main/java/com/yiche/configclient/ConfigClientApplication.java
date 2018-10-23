package com.yiche.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${App.server.address}")
    String ip;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "liyang") String name) {
        return "hi " + name + " ,i am from address:" + ip;
    }
}
