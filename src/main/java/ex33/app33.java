package ex33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
//
//Example Output
//What's your question?
//> Will I be rich and famous?
//
//Ask again later.
//Constraint
//The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.
public class app33 {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList <String>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Ask again later.");
        answers.add("Maybe");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your question? ");
        String question = scanner.nextLine();
        System.out.println(answers.get((int) (Math.random() * 4)));
    }
}