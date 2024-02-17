package org.swain.chapter2;

import java.util.Scanner;

/*Create a program that asks a user for a season of the year, 
then a whole number, then an adjective. Use the input to 
complete the senence below then output the result:

"On a [adjective][season of the year] day, I drink a 
minimum of [whole number] cups of cofee"
 */
public class MadLibs {

    public static void main(String args[]) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a season of the year:");
            String season = scanner.next();

            System.out.println("Enter an adjective:");
            String adjective = scanner.next();

            System.out.println("Enter a whole number:");
            int number = scanner.nextInt();

            System.out.println("On a " + adjective + " " + season + " day, I drink a \n"
                    + //
                    "minimum of " + number + " cups of coffee.");

        }
    }
}
