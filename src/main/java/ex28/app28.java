package ex28;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class app28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            total += n;
        }
            System.out.printf("The total is: %d\n", total);
        }
    }