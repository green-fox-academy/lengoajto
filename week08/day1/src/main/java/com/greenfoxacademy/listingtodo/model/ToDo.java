package com.greenfoxacademy.listingtodo.model;

public class ToDo {

    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public ToDo(long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public ToDo() {
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}



//Listing Todos from embedded database
//Create a Spring project with Gradle
//Add dependencies:
//JPA, H2, DevTools, Web, Thymeleaf
////Optional dependencies:
////Lombok
//Create classes
//Add a Todo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false))
//Controller
//Create a new controller called TodoController which maps to /todo
//Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.
//Run the application. If all works fine, then you can go ahead.