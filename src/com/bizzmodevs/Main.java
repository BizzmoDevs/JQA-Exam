package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Restaurant> RestaurantList = new ArrayList<>();
    static int restaurantCounter = 0;

    public static void main(String[] args) {

        //INIT DEFAULT RESTAURANTS
        Restaurant r1 = new Restaurant("Pizzeria Gdynianka", 5,2,true);
        RestaurantList.add(r1);
        Restaurant r2 = new Restaurant("Zapiekanki Pod Mostem", 1, 0, false);
        RestaurantList.add(r2);

        Scanner scanner = new Scanner(System.in);
        int menuSelection = 0;

        System.out.println("Hello!");
        System.out.println("Available restaurants list below:");

        for ( Restaurant r : RestaurantList) {
            restaurantCounter++;
            System.out.println(restaurantCounter + ". " + r.restaurantName);
        }

        System.out.println("Choose the restaurant by it's number.");
        menuSelection = scanner.nextInt();
        RestaurantList.get(menuSelection-1).UIMenu();


    }
}
