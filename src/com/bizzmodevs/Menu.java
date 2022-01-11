package com.bizzmodevs;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String,MenuItem> menuList = new HashMap<>();

    public void printMenu() {
        int counter = 0;
        for (MenuItem i : menuList.values()) {
            counter++;
            System.out.println(counter + ". " + i.itemName + " '" + i.itemDescription + "'" + " with price: " + i.itemPrice + " PLN");
        }
    }

    public int getPriceByName(MenuItem item) {
        return item.itemPrice;
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        MenuItem newItem = new MenuItem(itemName, itemDescription, itemPrice);
        String itemNameS = itemName;
        menuList.put(itemName, newItem);
    }
}
