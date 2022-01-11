package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant extends Building {

    List<Employee> employeesList = new ArrayList<>();
    Menu menu = new Menu();
    String restaurantName;
    int UImenuSelection;

    public Restaurant(String restaurantName, int roomsNumber, int bathroomNumber, boolean kitchen) {
        this.restaurantName = restaurantName;
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public void showEmployeesList() {
        if (employeesList.isEmpty()) {
            System.out.println("There is no employee working in this restaurant!");
        } else {
            for ( Employee e : employeesList) {
                e.printEmployeeData();
            }
        }
    }

    public void showBuildingStatus() {
        showBuildingProperties();
    }

    public Employee getEmployeeByNumber() {
        System.out.println("Choose employee");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return employeesList.get(i);
    }

    public void addEmployee() {
        String fullName, position;
        int salaryPerHour;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in employee full name (name + surname)");
        fullName = scanner.nextLine();
        System.out.println("Type in employee position");
        position = scanner.nextLine();
        System.out.println("Type in employee salary per hour");
        salaryPerHour = scanner.nextInt();
        Employee e = new Employee(fullName, position, salaryPerHour);
        employeesList.add(e);
    }

    public void showRestaurantMenu() {

    }

    private void addMenuPosition() {

    }

    public void UIMenu() {
        while (UImenuSelection != 7) {
            System.out.println("Welcome in " + restaurantName + ".");
            System.out.println("What you want to do? Choose your option by number:");
            System.out.println("1. Show restaurant rooms");
            System.out.println("2. Show restaurant menu");
            System.out.println("3. Show restaurant employees");
            System.out.println("4. Add new employee");
            System.out.println("5. Get restaurant employee by name");
            System.out.println("6. Add new menu position");
            System.out.println("7. Exit");

            Scanner scanner = new Scanner(System.in);
            UImenuSelection = scanner.nextInt();

            switch (UImenuSelection) {
                case 1:
                    showBuildingStatus();
                    break;
                case 2:
                    showRestaurantMenu();
                    break;
                case 3:
                    showEmployeesList();
                    break;
                case 4:
                    addEmployee();
                    break;
                case 5:
                    getEmployeeByNumber();
                    break;
                case 6:
                    addMenuPosition();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Wrong option!!!!!!!!!!!!!!!!!");
                    break;
            }
        }

    }
}
