package com.mnfgc.vendingmachine.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mnfgc.vendingmachine.models.Item;

public class VendingDaoText implements VendingDao {

    private final String INVENTORY = "";

    @Override
    public String vend(String code, Long payment) throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(INVENTORY)));
        List<Item> out = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            if (line.length == 2) {
                Item.builder().code(line[1]).cost(Long.parseLong(line[0])).build();
            }

        }
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Item> getInventory() throws FileNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

}
