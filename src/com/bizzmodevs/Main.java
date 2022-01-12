package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Restaurant> restaurantList = new ArrayList<>();
    static int mainMenuSelection;

    public static void main(String[] args) {

        //INIT DEFAULT RESTAURANTS
        Restaurant r1 = new Restaurant("Pizzeria Gdynianka", 5,1,true);
        restaurantList.add(r1);
        Restaurant r2 = new Restaurant("Zapiekanki Pod Mostem", 1, 0, false);
        restaurantList.add(r2);
        Restaurant r3 = new Restaurant("Villa Siciliana", 12, 4, true);
        restaurantList.add(r3);

        //INIT DEFAULT EMPLOYEES
        Employee e = new Employee("Karol Odwald", "Manager", 50);
        r1.employeesList.add(e);
        Employee e2 = new Employee("Maciej Kowalski", "Chef", 20);
        r1.employeesList.add(e2);
        Employee e3 = new Employee();
        e3.setFullName("John Rambo");
        e3.setPosition("Killer");
        e3.setSalaryPerHour(90);
        r1.employeesList.add(e3);

        //INIT DEFAULT MENU ITEMS
        MenuItem i = new MenuItem("Mexicana", "Pizza with Salami, Oregano and Tabasco Sauce", 28);
        r1.menu.menuItems.put("Mexicana", i);
        MenuItem i2 = new MenuItem("Napolitana", "Pizza with Ham, Oregano and Tomato Sauce", 25);
        r1.menu.menuItems.put("Napolitana", i2);

        //----------------------------TEST METHODS-----------------------------------//
        System.out.println("********************");
        System.out.println("PIZZERIA GDYNIANKA:");
        r1.showBuildingProperties();
        System.out.println("MENU:");
        r1.showRestaurantMenu();
        System.out.println("EMPLOYEES:");
        r1.showEmployeesList();
        System.out.println("********************");
        System.out.println("Changing" + r1.employeesList.get(0).getFullName() + " salary to 60... ");
        r1.employeesList.get(0).setSalaryPerHour(60);
        System.out.println("********************");
        //TODO find Employee by name and show updated salary

        //------------------------------TEST UI--------------------------------------//
        System.out.println("");
        System.out.println("Hello! Welcome in the Restaurant Manager Studio v1.0.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your option by pressing a number on the keyboard.");
        System.out.println("0. Exit program");
        System.out.println("1. Show the restaurant list");
        System.out.println("2. Add new restaurant");
        System.out.println("3. Bonus exercises");
        mainMenuSelection = scanner.nextInt();

        switch (mainMenuSelection) {
            case 0: System.out.println("Exiting program."); break;
            case 1: showRestaurantList(); break;
            case 2: addNewRestaurant(); break;
            case 3: runBonusExercises(); break;
            default: System.out.println("Type in correct number");
        }

    }

    private static void showRestaurantList() {
        Scanner scanner2 = new Scanner(System.in);
        int menuSelection = 0;
        int restaurantCounter = 0;
        System.out.println("Available restaurants list below:");
        for ( Restaurant r : restaurantList) {
            restaurantCounter++;
            System.out.println(restaurantCounter + ". " + r.restaurantName);
        }

        System.out.println("Choose the restaurant by it's number.");
        menuSelection = scanner2.nextInt();
        restaurantList.get(menuSelection-1).UIMenu();
    }

    private static void addNewRestaurant() {
        Scanner scanner = new Scanner(System.in);
        String restaurantName;
        int roomsNumber, bathroomNumber;
        boolean kitchen;
        System.out.println("Type in restaurant name."); restaurantName = scanner.nextLine();
        System.out.println("Type in number of rooms in restaurant."); roomsNumber = scanner.nextInt();
        System.out.println("Type in number of bathrooms in restaurant."); bathroomNumber = scanner.nextInt();
        System.out.println("Is there a kitchen in restaurant? (Type in true or false)"); kitchen = scanner.nextBoolean();
        Restaurant r = new Restaurant(restaurantName,roomsNumber,bathroomNumber,kitchen);
        restaurantList.add(r);
    }

    private static void runBonusExercises() {

        //1
        System.out.println("");
        System.out.println("1. PRIMITIVE TYPE MIN and MAX value PRINTING");
        System.out.println("byte MIN: " + Byte.MIN_VALUE);
        System.out.println("byte MAX: " + Byte.MAX_VALUE);
        System.out.println("short MIN: " + Short.MIN_VALUE);
        System.out.println("short MAX: " + Short.MAX_VALUE);
        System.out.println("int MIN: " + Integer.MIN_VALUE);
        System.out.println("int MAX: " + Integer.MAX_VALUE);
        System.out.println("long MIN: " + Long.MIN_VALUE);
        System.out.println("long MAX: " + Long.MAX_VALUE);
        System.out.println("float MIN: " + Float.MIN_VALUE);
        System.out.println("float MAX: " + Float.MAX_VALUE);
        System.out.println("double MIN: " + Double.MIN_VALUE);
        System.out.println("double MAX: " + Double.MAX_VALUE);
        System.out.println("bool FALSE: " + Boolean.FALSE);
        System.out.println("bool TRUE: " + Boolean.TRUE);
        System.out.println("char MIN: " + Character.MIN_VALUE);
        System.out.println("char MAX: " + Character.MAX_VALUE);

        //2
        System.out.println("");
        System.out.println("2. VARIABLE OVERFLOW");
        System.out.println("MAX INT + 1 = " + (Integer.MAX_VALUE + 1));
        System.out.println("MIN INT - 1 = " + (Integer.MIN_VALUE - 1));

        //3
        System.out.println("");
        System.out.println("3. DIFFERENT SHAPES PRINTING");
        System.out.println("");
        System.out.println("FULL SQUARE");
        for (int x = 0; x<10; x++) {
            for (int y = 0; y<10; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("EMPTY SQUARE");
        for (int x = 0; x<10; x++) {
            for (int y = 0; y<10; y++) {
                if ((x>0)&&(x<9)) {
                    if ((y==0)||(y==9)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                else { System.out.print("*"); }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("RIGHT TRIANGLE");
        for (int x = 0; x<10; x++) {
            for (int y = 0; y<x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

}
