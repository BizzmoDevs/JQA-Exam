package com.bizzmodevs;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<Integer,MenuItem> menuItems = new HashMap<>();

    public void printMenu() {
        for (MenuItem i : menuItems.values()) {
            System.out.println(i.getItemName() + " '" + i.getItemDescription() + "' " + "with price: " + i.getItemPrice() + " PLN");
        }
    }

    public void getPriceByName(String menuItemName) {
        MenuItem item = menuItems.get(menuItemName);
        if (item != null) {
            System.out.println(item.getItemName() + " price is " + item.getItemPrice());;
        } else {
            System.out.println("There is no such Item in Menu");
        }
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        MenuItem newItem = new MenuItem(itemName, itemDescription, itemPrice);
        menuItems.put(menuItems.size()+1, newItem);
        System.out.println(itemName + " was added into menu on position: " + menuItems.size()+1);
    }
}
