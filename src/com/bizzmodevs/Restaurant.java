package com.bizzmodevs;

import java.util.*;

public class Restaurant extends Building {

    TreeSet<Employee> employeesList = new TreeSet<Employee>();
    Menu menu = new Menu();
    String restaurantName;

    public Restaurant(String restaurantName, int roomsNumber, int bathroomNumber, boolean kitchen) {
        this.restaurantName = restaurantName;
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public void showEmployeesList() {
        Iterator<Employee> iterator = employeesList.iterator();

        if (employeesList.isEmpty()) {
            System.out.println("There is no employees working in this restaurant!");
        } else {
            while ( iterator.hasNext()) {
                iterator.next().printEmployeeData();
            }
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        Iterator<Employee> iterator = employeesList.iterator();
        while ( iterator.hasNext()) {
            Employee e = iterator.next();

            if (Objects.equals(e.getFullName(), employeeName)) {
                System.out.println("FOUND: " + e.getFullName());
                return e;
            }
        }
        System.out.println("There is no such Employee named: " + employeeName);
        return null;
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

    //TODO HOW TO ITERATE MENUs?
    public void addNewMenu(Menu menu) {
        this.menu = menu;
    }

    //TODO GET MENU BY?
    public Menu getMenu () {
        return menu;
    }
}
