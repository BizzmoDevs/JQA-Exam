package com.bizzmodevs;

public class Building {
    int roomsNumber, bathroomNumber;
    boolean kitchen;

    public void showBuildingProperties() {
        if (kitchen) {
            System.out.println("Building has " + roomsNumber + " rooms, " + bathroomNumber + " bathroom(s)" + " and kitchen" );
        }
        else {
            System.out.println("Building has " + roomsNumber + " rooms, " + bathroomNumber + " bathroom(s)" + " and no kitchen" );
        }
    }
}
