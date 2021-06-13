package ex27;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//The first name must be filled in.
//The last name must be filled in.
//The first and last names must be at least two characters long.
//An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//The ZIP code must be a number.
//Display appropriate error messages on incorrect data.
//
//Example Output
//Enter the first name: J
//Enter the last name:
//Enter the ZIP code: ABCDE
//Enter the employee ID: A12-1234
//The first name must be at least 2 characters long.
//The last name must be at least 2 characters long.
//The last name must be filled in.
//The employee ID must be in the format of AA-1234.
//The zipcode must be a 5 digit number.
//Or
//
//Enter the first name: John
//Enter the last name: Johnson
//Enter the ZIP code: 55555
//Enter the employee ID: TK-4321
//There were no errors found.
public class app27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter the employee ID: ");
        String iD = scanner.nextLine().trim();

        System.out.println("Enter the ZIP code: ");
        int zip = scanner.nextInt();
        boolean errors = false;
        if(firstName.length() < 2)
        {
            errors = true;
            System.out.println("The first name must be at least 2 characters long.");
            if(firstName.length() == 0)
            {
                System.out.println("The first name must be filled in.");
            }
        }
        if(lastName.length() < 2)
        {
            errors = true;
            System.out.println("The last name must be at least 2 characters long.");
            if(firstName.length() == 0)
            {
                System.out.println("The last name must be filled in.");
            }
        }
        if(iD.length() != 7 ||
                !isLetter(iD.charAt(0)) || !isLetter(iD.charAt(1)) ||
                iD.charAt(2) != '-' ||
                !isDigit(iD.charAt(3)) || !isDigit(iD.charAt(4)) || !isDigit(iD.charAt(5)) || !isDigit(iD.charAt(6)))
                    {
                        errors = true;
                        System.out.println("The employee ID must be in the format of AA-1234.");
                    }
        if(String.valueOf(zip).length() != 5)
        {
            errors = true;
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(!errors)
        {
            System.out.println("There were no errors found.");
        }
                }
            }



