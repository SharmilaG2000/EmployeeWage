package com.bridgelabz.employeewage;

public class EmployeeWageUC3 {
    // Constants (must be static final to use in switch)
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Variables
        int empHrs = 0, empWage = 0;

        // Randomly decide employee type
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Part-Time");
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Full-Time");
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is Absent");
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}
