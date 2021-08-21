package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/tali")
    public String tali(@RequestParam(value = "name", defaultValue = "Tali, she is monster") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/eden")
    public String eden(@RequestParam(value = "name", defaultValue = "Eden, she is princess") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/yael")
    public String yael(@RequestParam(value = "name", defaultValue = "Yael, she is bomba") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/")
    public String home() {
        return "Hello. Use: /eden, /yael or /tali";
    }
}