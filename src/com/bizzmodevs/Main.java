package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Restaurant> RestaurantList = new ArrayList<>();
    static int mainMenuSelection;

    public static void main(String[] args) {

        //INIT DEFAULT RESTAURANTS
        Restaurant r1 = new Restaurant("Pizzeria Gdynianka", 5,1,true);
        RestaurantList.add(r1);
        Restaurant r2 = new Restaurant("Zapiekanki Pod Mostem", 1, 0, false);
        RestaurantList.add(r2);
        Restaurant r3 = new Restaurant("Villa Siciliana", 12, 4, true);
        RestaurantList.add(r3);

        System.out.println("Hello! Welcome in the Restaurant Manager Studio v1.0.");

        do {
            mainMenuSelection = -99;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose your option by pressing a number on the keyboard.");
            System.out.println("0. Exit program");
            System.out.println("1. Show the restaurant list");
            mainMenuSelection = scanner.nextInt();


            switch (mainMenuSelection) {
                case 0: System.out.println("Exiting program."); break;
                case 1: showRestaurantList(); break;
                default: System.out.println("Type in correct number");
            }

        } while (mainMenuSelection != 0);

    }

    private static void showRestaurantList() {
        Scanner scanner2 = new Scanner(System.in);
        int menuSelection = 0;
        int restaurantCounter = 0;
        System.out.println("Available restaurants list below:");
        for ( Restaurant r : RestaurantList) {
            restaurantCounter++;
            System.out.println(restaurantCounter + ". " + r.restaurantName);
        }

        System.out.println("Choose the restaurant by it's number.");
        menuSelection = scanner2.nextInt();
        RestaurantList.get(menuSelection-1).UIMenu();
    }
}
