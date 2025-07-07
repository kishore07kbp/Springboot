package com.example.springbootfirst.Controllers;

import com.example.springbootfirst.Services.HelloWorldService;
import com.example.springbootfirst.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public List<Employee> getMethod() {
        return helloWorldService.getmethod();
    }

    @PostMapping("/post")
    public String postMethod() {
        return helloWorldService.postmethod();
    }

    @PutMapping("/put")
    public String putMethod() {
        return helloWorldService.putmethod();
    }

    @DeleteMapping("/delete")
    public String deleteMethod() {
        return helloWorldService.deletemethod();
    }
}
