package com.springboot.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHey(){
        return "Hello..";
    }

    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi..";
    }

}
