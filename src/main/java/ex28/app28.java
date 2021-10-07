package ex28;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class app28 {
    public static int sum(int[] values){
        int total = 0;
        for(int i = 0; i < values.length; ++i)
        {
            total+=values[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int [5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            values[i] = n;
        }
            System.out.printf("The total is: %d\n", sum(values));
        }
    }