package com.mnfgc.vendingmachine.controllers;

import com.mnfgc.vendingmachine.view.Cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendingController {

    private boolean notDone = true;
    private final Cli cli;
    

    @Autowired
    public VendingController(Cli cli) {
        this.cli = cli;
    }

    public void run() {
        while (notDone) {
            while (notDone) {
                switch (getSelection()) {
                case 1:
                    System.out.println("1: TODO");
                    break;
                case 2:
                System.out.println("2: TODO");
                    break;
                case 3:
                System.out.println("3: TODO");
                    break;
                case 0:
                    notDone = false;

                }
            }
        }
    }

    private int getSelection() {
        return cli.getSelection();
    }

}
