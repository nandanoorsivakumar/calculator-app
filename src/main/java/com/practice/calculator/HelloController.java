package com.practice.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/add")
    public int add(int a, int b){
        return a + b;
    }

    @GetMapping("/sub")
    public int substraction(int a, int b){
        return a - b;
    }

    @GetMapping("/multiply")
    public int mul(int a, int b){
        return a * b;
    }
}