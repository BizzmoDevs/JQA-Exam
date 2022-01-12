package com.bizzmodevs;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String,MenuItem> menuItems = new HashMap<>();

    public void printMenu() {
        int counter = 0;
        for (MenuItem i : menuItems.values()) {
            counter++;
            System.out.println(counter + ". " + i.itemName + " '" + i.itemDescription + "' " + "with price: " + i.itemPrice + " PLN");
        }
    }

    public void getPriceByName(String restaurantName) {
        MenuItem item = menuItems.get(restaurantName);
        if (item != null) {
            System.out.println(item.itemName + " price is " + item.itemPrice);;
        } else {
            System.out.println("There is no such Item in Menu");
        }
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        MenuItem newItem = new MenuItem(itemName, itemDescription, itemPrice);
        menuItems.put(itemName, newItem);
    }
}
