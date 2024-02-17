package org.Swain.chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    /*
* While loop
 * Each store employee makes $15 an hour. 
 * Write a program that allows a manager 
 * to enter the number of weekly hours worked
 * for each employee, and calculate their pay.
 * Do not allow for overtime
     */
    public static void main(String args[]) {

        //initiallize what we know
        int rate = 15;
        int maxHours = 40;

        //get what we don't know
        System.out.println("How many hours did you work this week?");
        try (Scanner scanner = new Scanner(System.in)) {
            double hoursWorked = scanner.nextDouble();

            //Validate input
            while (hoursWorked > maxHours || hoursWorked < 1) {
                System.out.println("Invlaid entry. Yours hours must be between 1 and 40. Try again!");
                hoursWorked = scanner.nextDouble();

            }

            //Calculate gross
            double gross = rate * hoursWorked;
            System.out.println("Gross pay: $" + gross);

        }
    }

}
