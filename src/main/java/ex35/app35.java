package ex35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
//
//Example Output
//Enter a name: Homer
//Enter a name: Bart
//Enter a name: Maggie
//Enter a name: Lisa
//Enter a name: Moe
//Enter a name:
//The winner is... Maggie.
//Constraints
//Use a loop to capture user input into an array.
//Use a random number generator to pluck a value from the array.
//Don’t include a blank entry in the array.
//Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.
public class app35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> players = new ArrayList <String>();
      while(true)
      {
          System.out.print("Enter a name: ");
            String name = scanner.nextLine().trim();
            if(name.length() == 0)
            {
                break;
            }
            players.add(name);
      }
      int choice = (int)(Math.random()*players.size());
      System.out.println("The winner is... " +players.get(choice));
    }
}