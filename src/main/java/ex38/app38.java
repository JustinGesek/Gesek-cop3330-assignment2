package ex38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.
//
//Example Output
//Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
//The even numbers are 2 4 6 8.
//Constraints
//Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
//Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
//Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.
public class app38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        Scanner nscanner = new Scanner(input);
        System.out.print("The even numbers are ");
        while (nscanner.hasNext())
        {
            numbers.add(nscanner.nextInt());
        }
        numbers = filterEvenNumbers(numbers);
        for (Integer number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println("");
    }
    static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        return evens;
    }
}


