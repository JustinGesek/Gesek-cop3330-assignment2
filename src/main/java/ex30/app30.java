package ex30;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
public class app30 {
    public static void main(String[] args) {
        for(int i = 1; i <= 12; ++i)
        {
            for(int j = 1; j <= 12; ++j)
            {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}