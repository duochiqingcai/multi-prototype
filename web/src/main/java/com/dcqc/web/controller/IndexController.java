package com.dcqc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {

    @GetMapping("/index")
    public String indexRequest() {
        return "index code !!!";
    }
}
