package com.bizzmodevs;

import java.util.HashSet;

public class Menu {
    HashSet<MenuItem> menuList = new HashSet();

    Menu() {
        MenuItem menuItem1 = new MenuItem("Mexicana", "Pizza z ostrym sosem", 32);
        menuList.add(menuItem1);
        MenuItem menuItem2 = new MenuItem("Italiana", "Pizza z salami", 28);
        menuList.add(menuItem2);
    }

    public void printMenu() {
        for (MenuItem item : menuList) {
            System.out.println(item.itemName + " '" + item.itemDescription + "' " + " with price: " + item.itemPrice + " PLN");
        }
    }

    public int getPriceByName(MenuItem item) {
        return item.itemPrice;
    }

    public void addMenuItem(String itemName, String itemDescription, int itemPrice) {
        MenuItem newItem = new MenuItem(itemName, itemDescription, itemPrice);
        menuList.add(newItem);
    }
}
