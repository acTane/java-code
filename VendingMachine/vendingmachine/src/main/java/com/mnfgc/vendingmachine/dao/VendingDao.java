package com.mnfgc.vendingmachine.dao;

import java.io.FileNotFoundException;
import java.util.List;

import com.mnfgc.vendingmachine.models.Item;

public interface VendingDao {

    public String vend(String code, Long payment) throws FileNotFoundException;
    public List<Item> getInventory() throws FileNotFoundException;
    
}
