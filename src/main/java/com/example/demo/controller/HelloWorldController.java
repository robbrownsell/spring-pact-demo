package com.example.demo.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    @QueryMapping
    public String helloQuery() {
        return "Hello world!";
    }

}
