package ex24;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Enter two strings and I'll tell you if they are anagrams:
//Enter the first string: note
//Enter the second string: tone
//"note" and "tone" are anagrams.

public class app24 {
    public static String sort(String s)
    {
        char sAsArray[] = s.toCharArray();
        Arrays.sort(sAsArray);
        return new String(sAsArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first String: ");
        String one = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String two = scanner.nextLine();
        if(sort(one).equals(sort(two)))
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.\n", one, two);

        }
        else
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.\n", one, two);

        }
    }
}
