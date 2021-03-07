/*
* Name: Jerome Ortega
* Module 1 - String Manipulation
* Date: March 7, 2021
*/

package com.company;
import java.util.*;

public class Main {
    final static int MIN_HOURS = 12;
    final static int MAX_HOURS = 20;

    public static void main(String[] args) {
        float hoursSpent;
        String firstName;
        String lastName;
        String fullName;
        String formattedHours;
        Scanner sc = new Scanner(System.in);

        // Collect user's name in two pieces and combine to one string.
        System.out.print("Enter first name, please capitalize the first letter: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name, please capitalize the first letter: ");
        lastName = sc.nextLine();
        fullName = firstName.concat(" ").concat(lastName);

        // Print combined name to user.
        System.out.printf("Your name is: %s%n", fullName);

        // Print out the length of the name, minus 1 to account for the space between.
        System.out.printf("The length of your name is: %d%n", fullName.length() - 1);
        System.out.printf("In upper case: %s%n", fullName.toUpperCase());
        System.out.printf("In lower case: %s%n", fullName.toLowerCase());

        // Let user know how many hours should be spent.
        System.out.printf(
            "%s, you should spend an average of %s - %s hours on this course each week.\n",
            firstName,
            MIN_HOURS,
            MAX_HOURS
        );

        // Collect number of hours spent, format to one decimal place and output.
        System.out.print("Enter the number of hours you spent up to three decimal places: ");
        hoursSpent = sc.nextFloat();
        formattedHours = String.format("%.1f", hoursSpent);
        System.out.printf("Your hours rounded are: %s%n", formattedHours);
    }
}
