package com.jam.biggun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HellorWordController {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Hello Word";
    }
}
