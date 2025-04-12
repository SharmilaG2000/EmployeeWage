package com.bridgelabz.employeewage;

public class EmployeeWageUC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Constants
        int IS_PRESENT = 1;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2; // returns 0 or 1

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
