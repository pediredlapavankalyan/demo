package com.example.demo.service;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Service {
    @GetMapping("/hi_kube")
    public String method(){
        log.info("api called");
        return "my application running";
    }

    @GetMapping("/hi_kube1")
    public String method1(){
        return "my application running";
    }
    @GetMapping("/hi_kube2")
    public String method2(){
        return "my application running";
    }
    @GetMapping("/hi_kube3")
    public String method3(){
        return "my application running";
    }
}
