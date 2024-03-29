package org.swain.chapter3;

import java.util.Scanner;
/*
 * Logical operators:
 * To qualify for a loan, a person must make at least $30,000
 * and have been woring at their current job for at least 2 years.
 */

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
         //Initialize what we know 
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't 
        System.out.println("Enter your salary:");
        try (Scanner scanner = new Scanner(System.in)) {
            double salary = scanner.nextDouble();

            System.out.println("Enter the number of years with your current employer:");
            double years = scanner.nextDouble();

            //Make decision
            if (salary >= requiredSalary && years >= requiredYearsEmployed) {
                    System.out.println("Congrats! You qualify for the loan!");            
            } 
            else {
                System.out.println("Sorry, you must earn at least $" + requiredSalary
                        + " and have worked at least " +requiredYearsEmployed + " years to qualify for the loan.");
            }
        }
    }
        
}
