package com.pluralsight;

public class Employee {
    private int employeeId;
    private String Name;
    private double workedHours;
    private double payRate;

    public Employee(int employeeId, String name, double workedHours, double payRate) {
        this.employeeId = employeeId;
        Name = name;
        this.workedHours = workedHours;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setId(int employeeIdid) {
        this.employeeId = employeeIdid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay() {
        return workedHours * payRate;
    }

}

