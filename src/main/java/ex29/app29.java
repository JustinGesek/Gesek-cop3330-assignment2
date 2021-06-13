package ex29;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.
//
//The formula is
//
//years = 72 / r
//where r is the stated rate of return.
//
//Example Output
//What is the rate of return? 0
//Sorry. That's not a valid input.
//What is the rate of return? ABC
//Sorry. That's not a valid input.
//What is the rate of return? 4
//It will take 18 years to double your initial investment.
//Constraints
//Don’t allow the user to enter 0.
//Don’t allow non-numeric values.
//Use a loop to trap bad input, so you can ensure that the user enters valid values.

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class app29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("What is the rate of return? ");
            String response = scanner.nextLine();
            try
            {
                int i = Integer.valueOf(response);
                if(i > 0)
                {
                    System.out.printf("It will take %d years to double your initial investment.\n", 72 / i );
                    break;
                }
                System.out.println("Sorry. That's not a valid input.");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }
}