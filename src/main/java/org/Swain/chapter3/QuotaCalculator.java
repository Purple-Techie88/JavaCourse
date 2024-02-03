package org.Swain.chapter3;

import java.util.Scanner;

public class QuotaCalculator {

/*IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short. 
 */
    
    public static void main (String args[]){

        //Initialize values we know
        int expectedSales = 10;
        String celebratory = "Congrats on meeting your sales goal! Let's GO!";
        //Get unknown values
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesMade = scanner.nextInt();
        scanner.close();
        //Make a decision on the path to take - Output
        if(salesMade >= expectedSales){
            System.out.println(celebratory);
        }else{
            int salesShort = expectedSales - salesMade;
            System.out.println(" You didn't meet your quota. " + "You were short " + salesShort + " sales!");
        }
    }
}
