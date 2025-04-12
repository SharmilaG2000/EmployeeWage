package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageUC8 {

    public static int computeEmployeeWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;
        Random random = new Random();

        while (totalWorkingDays < maxWorkingDays && totalWorkingHours <= maxWorkingHours) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3); // 0-Absent, 1-Full time, 2-Part time
            int hoursWorked = 0;

            switch (empCheck) {
                case 1:
                    hoursWorked = 8; // Full day hours
                    break;
                case 2:
                    hoursWorked = 4; // Part time hours
                    break;
                default:
                    hoursWorked = 0; // Employee is absent
            }

            totalWorkingHours += hoursWorked;
            if (totalWorkingHours > maxWorkingHours) {
                totalWorkingHours -= hoursWorked;
                totalWorkingDays--;
                break;
            }
            totalWage += hoursWorked * wagePerHour;
        }

        System.out.println("Company: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dellWage = computeEmployeeWage("Dell", 20, 20, 100);
        int wiproWage = computeEmployeeWage("Wipro", 25, 22, 120);

        System.out.println("Total Wage for Dell: " + dellWage);
        System.out.println("Total Wage for Wipro: " + wiproWage);
    }
}

