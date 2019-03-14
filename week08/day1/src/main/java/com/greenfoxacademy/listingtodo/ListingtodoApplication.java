package com.greenfoxacademy.listingtodo;


import com.greenfoxacademy.listingtodo.repository.RepositoryInterface;
import com.greenfoxacademy.listingtodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private RepositoryInterface repositoryInterface;

    @Autowired
    public ListingtodoApplication(TodoRepository todoRepository, RepositoryInterface repositoryInterface){
        this.repositoryInterface = repositoryInterface;
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingtodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
