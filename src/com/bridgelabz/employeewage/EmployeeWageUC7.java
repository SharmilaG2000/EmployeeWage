package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageUC7 {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalWage = computeEmployeeWage();
        System.out.println("Total Employee Wage: " + totalWage);
    }

    public static int computeEmployeeWage() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;
        Random random = new Random();

        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours <= MAX_WORKING_HOURS) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3); // 0-Absent, 1-Full time, 2-Part time
            int hoursWorked = 0;

            switch (empCheck) {
                case 1:
                    hoursWorked = FULL_DAY_HOURS;
                    break;
                case 2:
                    hoursWorked = PART_TIME_HOURS;
                    break;
                default:
                    hoursWorked = 0; // Employee is absent
            }

            totalWorkingHours += hoursWorked;
            if (totalWorkingHours > MAX_WORKING_HOURS) {
                totalWorkingHours -= hoursWorked;
                totalWorkingDays--;
                break;
            }
            totalWage += hoursWorked * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        return totalWage;
    }
}
