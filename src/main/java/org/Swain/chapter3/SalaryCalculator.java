package org.swain.chapter3;

import java.util.Scanner;

/* IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional
bonus of $250
 */
public class SalaryCalculator {

    public static void main(String args[]) {
        //Initialize known values

        int salary = 1000;
        int bonus = 250;
        int salesQuota = 10;

        //Get values for the unkown
        System.out.println("How many sales did the employee make this week?");
        try (Scanner scanner = new Scanner(System.in)) {

            int sales = scanner.nextInt();

            //Quick detour for the bonus earners
            if (sales > salesQuota) {
                salary = salary + bonus;
            }

            //Output
            System.out.print("The employees pay is $" + salary);
        }

    }
}
