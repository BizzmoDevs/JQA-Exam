package com.bizzmodevs;

public class Employee {

    public String fullName, position;
    public int salaryPerHour;

    Employee(String fullName, String position, int salaryPerHour) {
        this.fullName = fullName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void printEmployeeData() {
        System.out.println(fullName + " is working as a " + position + " with salary per hour: " + salaryPerHour);
    }
}
