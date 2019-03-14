package com.greenfoxacademy.listingtodo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Asignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Todo> todos;

    public Asignee(){
        this.todos = new ArrayList<>();
    }

    public Asignee(String name, String email, List<Todo> todos){
        this.name = name;
        this.email = email;
        this.todos = todos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
