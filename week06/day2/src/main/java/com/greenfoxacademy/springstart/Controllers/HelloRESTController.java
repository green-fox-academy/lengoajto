package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong id = new AtomicLong(666);

    @RequestMapping(value = "/greeting")
        public Greeting greeting(@RequestParam String name) {
            Greeting greeting = new Greeting(id.getAndAdd(1), name);
            return greeting;

    }

}
