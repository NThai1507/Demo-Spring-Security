package com.ryo.author.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/security")
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> getHome(){
        return ResponseEntity.ok("Well come Home!");
    }

    @GetMapping("/detail")
    public ResponseEntity<String> getDetail(Principal principal){
        return ResponseEntity.ok("Detail Form");
    }
}
