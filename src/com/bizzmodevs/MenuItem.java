package com.bizzmodevs;

public class MenuItem {
    private String itemName, itemDescription;
    private int itemPrice, itemPosition;

    public MenuItem(int itemPosition, String itemName, String itemDescription, int itemPrice) {
        this.itemPosition = itemPosition;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPosition() {
        return itemPosition;
    }
}
