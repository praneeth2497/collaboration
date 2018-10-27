package com.praneeth.web4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/check")
    public ResponseEntity checkUrl()
    {
        System.out.println("at check method");
        
      
        
         return new ResponseEntity("praneeth",HttpStatus.OK);
    }
    @GetMapping("/helo")
    public ResponseEntity check()
    {
        System.out.println("at check method");
        
      
        
         return new ResponseEntity("sairam",HttpStatus.OK);
    }

}