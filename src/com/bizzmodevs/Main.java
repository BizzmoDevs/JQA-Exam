package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Restaurant> restaurantList = new ArrayList<>();

    public static void main(String[] args) {

        //INIT DEFAULT RESTAURANTS USING CONSTRUCTORS
        Restaurant r1 = new Restaurant("Pizzeria Gdynianka", 5,1,true);
        restaurantList.add(r1);
        Restaurant r2 = new Restaurant("Zapiekanki Pod Mostem", 1, 0, false);
        restaurantList.add(r2);
        Restaurant r3 = new Restaurant("Villa Siciliana", 12, 4, true);
        restaurantList.add(r3);
        //ADD NEW RESTAURANT USING METHOD
        addNewRestaurant("Super Burger", 2, 1,true);
        //INIT DEFAULT EMPLOYEES USING CONSTRUCTORS
        Employee e = new Employee("Karol", "Odwald", "Manager", 50);
        r1.employeesList.add(e);
        Employee e2 = new Employee("Maciej","Kowalski", "Chef", 20);
        r1.employeesList.add(e2);
        Employee e3 = new Employee("John", "Rambo", "Killer", 90);
        r1.employeesList.add(e3);
        //----------------------------TEST METHODS-----------------------------------//
        System.out.println("********************");
        System.out.println("PIZZERIA GDYNIANKA:");
        r1.showBuildingProperties();
        //ADD MENU ITEMS USING METHOD
        r1.menu.addMenuItem("Mexicana", "Pizza with Salami, Oregano and Tabasco Sauce", 28);
        r1.menu.addMenuItem("Napolitana", "Pizza with Ham, Oregano and Tomato Sauce", 25);
        System.out.println("MENU:");
        r1.showRestaurantMenu();
        System.out.println("EMPLOYEES:");
        r1.showEmployeesList();
        System.out.println("********************");
        System.out.println("Changing " + r1.employeesList.get(0).getFullName() + " salary to 60... ");
        r1.employeesList.get(0).setSalaryPerHour(60);
        System.out.println("ADDING NEW EMPLOYEE");
        r1.addEmployee("Michael", "Jackson", "Singer", 20);

        System.out.println("********************");
        System.out.println("EMPLOYEES:");
        r1.showEmployeesList();
        System.out.println("********************");
        System.out.println("Adding 'Bigos' to the Menu");
        r1.menu.addMenuItem("Bigos", "Kiszona kapusta z chlebem", 15);

        System.out.println("********************");
        System.out.println("FIND MENU ITEM BY NAME 'Bigos'" );
        r1.menu.getPriceByName("Bigos");

        System.out.println("********************");
        System.out.println("FIND EMPLOYEE BY FULLNAME 'Karol Odwald'" );
        r1.getEmployeeByName("Karol Odwald");

        //BONUS EXERCISES
        runBonusExercises();

    }

    private static void addNewRestaurant(String restaurantName, int roomsNumber, int bathroomNumber, boolean hasKitchen) {
        Restaurant r = new Restaurant(restaurantName,roomsNumber,bathroomNumber,hasKitchen);
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
                if ( (x==0)||(x==9)||(y==0)||(y==9) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
