package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @GetMapping("/test")
    public String test() {
        return "WORJKING FINE";
    }
    @GetMapping("/check")
    public String test() {
        return "WORJKING FINE";
    }
}
