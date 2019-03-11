package com.greenfoxacademy.listingtodo.controller;

import com.greenfoxacademy.listingtodo.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Generated;

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

    private RepositoryInterface repository;

    @Autowired
    public ToDoController(RepositoryInterface repository){
        this.repository = repository;
    }

    @GetMapping(value = {"/","/list"})
    public String list(Model model){
        model.addAttribute("todos", repository.findAll());
        return "todolist";
    }
}
