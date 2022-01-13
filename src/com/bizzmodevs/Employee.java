package com.bizzmodevs;

public class Employee {

    private String fullName, position;
    private int salaryPerHour;

    public Employee(String name, String surname, String position, int salaryPerHour) {
        this.fullName = name + " " + surname;
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
        System.out.println(getFullName() + " is working as a " + getPosition() + " with salary per hour: " + getSalaryPerHour());
    }
}
