package day04_arithmetic_operators;

public class WagesTest {
    public static void main(String[] args) {

        double regularWage; //The calculated regular wage
        double basePay=25.75; //The base pay
        double regularHours=40; //The hours worked less overtime
        double overtimeWages; //Overtime Wages
        double overTimePay=37.5; //Overtime Pay rate
        double overTimeHours=15;
        double totalWage; //Total Wage

        regularWage = basePay * regularHours;
        overtimeWages = overTimePay * overTimeHours;
        totalWage = regularWage + overtimeWages;

        System.out.println(totalWage);

    }
}
