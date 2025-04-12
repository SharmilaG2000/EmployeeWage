package com.bridgelabz.employeewage;

public class EmployeeWageUC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Constants
        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        // Variables
        int empHrs = 0;
        int empWage = 0;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2; // 0 or 1

        if (empCheck == IS_PRESENT) {
            empHrs = FULL_DAY_HOUR;
        } else {
            empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage: " + empWage);
    }
}

