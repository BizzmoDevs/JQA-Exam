package com.bizzmodevs;

import java.util.*;

public class Restaurant extends Building {

    List<Employee> employeesList = new ArrayList<>();
    Menu menu = new Menu();
    String restaurantName;

    public Restaurant(String restaurantName, int roomsNumber, int bathroomNumber, boolean kitchen) {
        this.restaurantName = restaurantName;
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public void showEmployeesList() {
        int employeeCounter = 0;
        if (employeesList.isEmpty()) {
            System.out.println("There is no employees working in this restaurant!");
        } else {
            for ( Employee e : employeesList) {
                employeeCounter++;
                System.out.print(employeeCounter + ". ");
                e.printEmployeeData();
            }
        }
    }

    //TODO get by name or surname or fullname?
    public void getEmployeeByName(String employeeName) {
        //GET
        Employee e = employeesList.get(1);
        if (e != null) {
            System.out.println(e.getFullName() + " is working as " + e.getPosition());;
        } else {
            System.out.println("There is no such Employee");
        }
    }

    public void addEmployee(String firstName,String surname, String position, int salaryPerHour) {
        Employee e = new Employee(firstName, surname, position, salaryPerHour);
        employeesList.add(e);
        System.out.println("New Employee was added!");
    }

    public void showRestaurantMenu() {
        if (menu.menuItems.isEmpty()) {
            System.out.println("Restaurant menu is empty!");
        } else {
            menu.printMenu();
        }
    }

    //TODO ADD MENU X

    //TODO GET MENU X
}
