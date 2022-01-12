package com.bizzmodevs;

import java.util.*;

public class Restaurant extends Building {

    Map<String, Employee> employeesList = new HashMap<>();
    Menu menu = new Menu();
    String restaurantName;
    int UISelection;

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
            for ( Employee e : employeesList.values()) {
                employeeCounter++;

                System.out.print(employeeCounter + ". ");
                e.printEmployeeData();
            }
        }
    }

    public void getEmployeeByName() {
        System.out.println("Type in employee name");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Employee e = employeesList.get(s);
        if (e != null) {
            System.out.println(e.getFullName() + " is working as " + e.getPosition());;
        } else {
            System.out.println("There is no such Employee");
        }
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
        employeesList.put(fullName,e);
        System.out.println("New Employee was added!");
    }

    public void showRestaurantMenu() {
        if (menu.menuItems.isEmpty()) {
            System.out.println("Restaurant menu is empty!");
        } else {
            menu.printMenu();
        }
    }

    private void addMenuPosition() {
        String itemName, itemDescription;
        int itemPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in menu item name");
        itemName = scanner.nextLine();
        System.out.println("Type in menu item description");
        itemDescription = scanner.nextLine();
        System.out.println("Type in menu item cost");
        itemPrice = scanner.nextInt();
        menu.addMenuItem(itemName, itemDescription, itemPrice);
        System.out.println("Item added to menu!");
    }

    public void UIMenu() {
        while (UISelection != 9) {
            System.out.println("Welcome in " + restaurantName + ".");
            System.out.println("What you want to do? Choose your option by number:");
            System.out.println("1. Show restaurant rooms");
            System.out.println("2. Show restaurant menu");
            System.out.println("3. Show restaurant employees");
            System.out.println("4. Add new employee");
            System.out.println("5. Get restaurant employee by name");
            System.out.println("6. Add new menu position");
            System.out.println("7. Get menu item price by name");
            System.out.println("9. Exit");

            Scanner scanner = new Scanner(System.in);

            try {
                UISelection = scanner.nextInt();
            } catch (Exception e) { //
            }

            switch (UISelection) {
                case 1:
                    showBuildingProperties();
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
                    getEmployeeByName();
                    break;
                case 6:
                    addMenuPosition();
                    break;
                case 7:
                    System.out.println("Type in Menu Item Name");
                    Scanner scanner2 = new Scanner(System.in);
                    String s = scanner2.nextLine();
                    menu.getPriceByName(s);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose correct number!");
                    break;
            }
        }

    }
}
