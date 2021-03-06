package com.mnfgc.vendingmachine.view;

import java.util.List;

import com.mnfgc.vendingmachine.models.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cli {

    private UserIO io;

    @Autowired
    public Cli(UserIO io) {
        this.io = io;
    }

    public int getSelection() {
        io.print("===VENDING=MACHINE===");

        return io.readInt("1. Pay\n2. Vend?\n3. View Inventory\n0. EXIT", 0, 3);
    }

    public String getMoney() {        
        return io.readStringRequired("How much money would you like to put in?");
    }

    public void message(String toString) {
        io.readString(toString+"\nPress enter to continue.");
    }

    public String getChoice() {
        return io.readStringRequired("What would you like?");
    }

    public void viewInventory(List<Item> inventory) {
        inventory.stream()
                .forEach(i->{ 
                    String[] s = i.toString().split("::");
                    io.print(String.format("Item: %s Price $%s Stock: %s", s[0],s[1],s[2]));
                });
    }
    
}
