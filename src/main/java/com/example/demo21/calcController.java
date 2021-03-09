package com.example.demo21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController {

    @GetMapping("www.myapp.com/{num}") 
    public static String addTen(@PathVariable int num) {
        int sum = num + 10;
        return "sum: " + sum;
    }

    @GetMapping("www.myapp.com/{num}/{num1}") 
    public static String twoParamAdder(@PathVariable int num, @PathVariable int num1) {
        int sum = num + num1;
        return "sum: " + sum;
    }
}







