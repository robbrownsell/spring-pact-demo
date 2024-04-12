package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person")
    public ResponseEntity<Person> getPerson() {
        return ResponseEntity.ok(new Person("John", "Doe", 30));
    }

}
