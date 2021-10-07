package ex25;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//A very weak password contains only numbers and is fewer than eight characters.
//A weak password contains only letters and is fewer than eight characters.
//A strong password contains letters and at least one number and is at least eight characters.
//A very strong password contains letters, numbers, and special characters and is at least eight characters.
//Example Output
//The password '12345' is a very weak password.
//The password 'abcdef' is a weak password.
//The password 'abc123xyz' is a strong password.
//The password '1337h@xor!' is a very strong password.
//Constraints
//Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
//Use a single output statement.
public class app25 {
    public static Object strength(String one) {
        int numberOfDigits = 0;
        int numberOfLetters = 0;
        int numberOfSpecials = 0;
        for(int i =0; i < one.length();++i)
        {
            if(isDigit(one.charAt(i)))
            {
                numberOfDigits+=1;
            } else if (isLetter(one.charAt(i)))
            {
                numberOfLetters+=1;
            }
            else
            {
                numberOfSpecials+=1;
            }
        }
        if(one.length() < 8)
        {
            if(numberOfDigits == one.length())
            {
                return (String) ("The password '"+one+"' is a very weak password.");
            }
            else if (numberOfLetters == one.length())
            {
                return (String)("The password '"+one+"' is a weak password.");
            }
            else
            {
                return (String)("The password '"+one+"' is a weasely password.");
            }
        }
        else
        {
            if(numberOfDigits > 0 && numberOfLetters > 0 && numberOfSpecials > 0)
            {
                return (String)("The password '"+one+"' is a very strong password.");

            }
            else if (numberOfDigits > 0 && numberOfLetters > 0)
            {
                return (String)("The password '"+one+"' is a strong password.");
            }
            else
            {
                return (String)("The password '"+one+"' is a weasely password.");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password and I will tell you how strong it is: ");
        String one = scanner.nextLine();
        System.out.println(strength(one));
    }
}

