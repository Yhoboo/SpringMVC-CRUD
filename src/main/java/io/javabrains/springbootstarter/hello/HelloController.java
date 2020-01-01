package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Create simple mapping : youtube.com/javabrains:springboot quick start 12
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
