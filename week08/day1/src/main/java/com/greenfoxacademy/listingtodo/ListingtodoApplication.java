package com.greenfoxacademy.listingtodo;

import com.greenfoxacademy.listingtodo.model.ToDo;
import com.greenfoxacademy.listingtodo.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodoApplication implements CommandLineRunner {

    @Autowired
    RepositoryInterface repositoryInterface;

    public static void main(String[] args) {
        SpringApplication.run(ListingtodoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
    repositoryInterface.save(new ToDo("kiverem"));
    }
}
