package com.bizzmodevs;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String,MenuItem> menuItems = new HashMap<>();
    private int itemsCounter;

    public void printMenu() {
        for (MenuItem i : menuItems.values()) {
            System.out.println(i.getItemPosition() + ". " + i.getItemName() + " '" + i.getItemDescription() + "' " + "with price: " + i.getItemPrice() + " PLN");
        }
    }

    public void getPriceByName(String restaurantName) {
        MenuItem item = menuItems.get(restaurantName);
        if (item != null) {
            System.out.println(item.getItemName() + " price is " + item.getItemPrice());;
        } else {
            System.out.println("There is no such Item in Menu");
        }
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        itemsCounter = menuItems.size()+1;
        //Causes incorrect incrementation while using the same itemName again overriding HashMap item...
        MenuItem newItem = new MenuItem(itemsCounter, itemName, itemDescription, itemPrice);
        menuItems.put(itemName, newItem);
    }
}
