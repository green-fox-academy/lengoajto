package com.greenfoxacademy.hellobeanworldapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldapplicationApplication implements CommandLineRunner {

    private Printer printer;

    @Autowired
    public HellobeanworldapplicationApplication (Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldapplicationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Helloka nyaloka!");
    }
}
