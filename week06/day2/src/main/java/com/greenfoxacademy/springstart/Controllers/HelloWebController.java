package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private AtomicLong id = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        Greeting greeting = new Greeting(id.getAndAdd(1), name);

        model.addAttribute("name", greeting.getContent());
        model.addAttribute("id", greeting.getId());


        return "greeting";
    }
}
