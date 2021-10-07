package ex37;

import java.util.*;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.
//
//Example Output
//What's the minimum length? 8
//How many special characters? 2
//How many numbers? 2
//Your password is aurn2$1s#
//Constraints
//Use lists to store the characters you’ll use to generate the passwords.
//Ensure that the generated password is random.
//Ensure that there are at least as many letters are there are special characters and number.
public class app37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> password = new ArrayList<Character>();

        System.out.print("What's the minimum length? ");
        int minLength = scanner.nextInt();
        System.out.print("How many special characters? ");
        int nSpecials = scanner.nextInt();
        System.out.print("How many numbers? ");
        int nDigits = scanner.nextInt();
        int nLetters = nSpecials + nDigits;
        int length = nSpecials + nDigits + nLetters;
        if (length < minLength) {
            int adjust = minLength - length;
            length += adjust;
            nLetters += adjust;
        }
        while (length > 0) {
            int n = (int) (Math.random() * length);
            if (n < nLetters) {
                char c = (char) (Math.random() * 26 + 'a');
                password.add(c);
                length -= 1;
                nLetters -= 1;
                continue;
            }
            n -= nLetters;
            if (n < nDigits)
            {
                char c = (char)(Math.random()*10 + '0');
                password.add(c);
                length-=1;
                nDigits-=1;
                continue;
            }
            n-=nDigits;
            if (n < nSpecials)
            {
                String specials = "!@#$%^&";
                char c = specials.charAt((int)(Math.random()*7));
                password.add(c);
                length-=1;
                nSpecials-=1;
                continue;
            }
        }
       String p = "";
        for (int i = 0; i < password.size(); ++i)
        {
            p = p + password.get(i);
        }
        System.out.println("Your password is "+p);
    }
}