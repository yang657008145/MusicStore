package com.example.demo5.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
     @RequestMapping("/")
     public String index(){
          return "你好啊";
     }
}
