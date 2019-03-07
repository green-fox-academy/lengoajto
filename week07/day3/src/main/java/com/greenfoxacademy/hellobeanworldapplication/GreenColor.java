package com.greenfoxacademy.hellobeanworldapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Green")
public class GreenColor implements MyColor {

    private Printer printer;

    @Autowired
    public GreenColor (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor () {
        printer.log("This is green");
    }

}
