package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greeting() {
        Greeting greeting = new Greeting(1, "Oh, Hi There!");
        return greeting;

    }

}
