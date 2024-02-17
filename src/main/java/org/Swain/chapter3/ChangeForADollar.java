package org.swain.chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String[] args) {
        //initialize what we know
        int dollar = 1;
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;

        //Ask what we don't 
        System.out.println("Enter the number of pennies:");
        try (Scanner scanner = new Scanner(System.in)) {
            double pennies = scanner.nextDouble() * penny;

            System.out.println("Enter the number of nickels:");
            double nickels = scanner.nextDouble() * nickel;

            System.out.println("Enter the number of dimes:");
            double dimes = scanner.nextDouble() * dime;

            System.out.println("Enter the number of quarters:");
            double quarters = scanner.nextDouble() * quarter;
            double userTotal = pennies + nickels + dimes + quarters;

            //Make a decision
            if (userTotal < dollar) {
                double underAmount = dollar - userTotal;
                System.out.println("You lose, you don't have enough money you need " + String.format("%.2f", underAmount) + "!");

            } else if (userTotal > dollar) {
                double overAmount = userTotal - dollar;
                System.out.println("You have too much money, you are over " + String.format("%.2f", overAmount) + "!");
            } else {
                System.out.println("You have $1, you win!");

            }
        }
    }

}
