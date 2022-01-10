package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Building {

    List<Employee> employeesList = new ArrayList<>();
    Menu menu = new Menu();
    String restaurantName;

    public Restaurant(String name, int rooms, int bathroom, boolean k) {
        //This??
        restaurantName = name;
        roomsNumber = rooms;
        bathroomNumber = bathroom;
        kitchen = k;
    }
}
