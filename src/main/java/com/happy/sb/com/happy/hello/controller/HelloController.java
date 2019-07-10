package com.happy.sb.com.happy.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(name ="/index",method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }
}
