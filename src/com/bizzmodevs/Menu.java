package com.bizzmodevs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Menu {
    Map<Integer,MenuItem> menuItems = new HashMap<>();

    public void printMenu() {
        for (Map.Entry<Integer, MenuItem> i : menuItems.entrySet()) {
            System.out.println(i.getKey() + ". " + i.getValue().getItemName() + " '" + i.getValue().getItemDescription() + "' " + "with price: " + i.getValue().getItemPrice() + " PLN");
        }
    }

    public int getPriceByName(String menuItemName) {
        Iterator<MenuItem> iterator = menuItems.values().iterator();
        while ( iterator.hasNext()) {
            MenuItem i = iterator.next();

            if (Objects.equals(i.getItemName() , menuItemName)) {
                System.out.println("FOUND: " + i.getItemName() + " with price: " + i.getItemPrice());
                return i.getItemPrice();
            }
        }
        System.out.println("There is no such Menu Item named: " + menuItemName);
        return 0;
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        MenuItem newItem = new MenuItem(itemName, itemDescription, itemPrice);
        int counter = menuItems.size();
        menuItems.put(counter++, newItem);
        System.out.println(itemName + " was added into menu on position: " + counter);
    }
}
