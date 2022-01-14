package com.bizzmodevs;

import java.io.PrintStream;

public class Building {
    int roomsNumber, bathroomNumber;
    boolean kitchen;

    public void showBuildingProperties() {
        String s = (kitchen) ? " and kitchen" : " and no kitchen";
        System.out.println("Building has " + roomsNumber + " rooms, " + bathroomNumber + " bathroom(s)" + s);
    }
}
