package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageUC5 {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWage = calculateMonthlyWage();
        System.out.println("Total Employee Wage for the Month: " + totalWage);
    }

    public static int calculateMonthlyWage() {
        int totalWage = 0;
        int dailyWage = 0;
        Random random = new Random();

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empCheck = random.nextInt(2); // 0 for Absent, 1 for Present

            if (empCheck == 1) {
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            } else {
                dailyWage = 0;
            }
            totalWage += dailyWage;
        }
        return totalWage;
    }
}
