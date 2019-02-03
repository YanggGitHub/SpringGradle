package com.yang.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class hello {
        @RequestMapping("/hello")
        public String hello(String name){
            return  "Hello.....Hello   "+name;
        }

}
