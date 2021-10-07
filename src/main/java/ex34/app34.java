package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.
//
//Example Output
//There are 5 employees:
//John Smith
//Jackie Jackson
//Chris Jones
//Amanda Cullen
//Jeremy Goodwin
//
//Enter an employee name to remove: Chris Jones
//
//There are 4 employees:
//John Smith
//Jackie Jackson
//Amanda Cullen
//Jeremy Goodwin
//Constraint
//Use an array or list to store the names.
public class app34 {
    public static String removeEmployee(ArrayList<String> employees, String toRemove)
    {
        try {
            employees.remove(toRemove);
        }catch (IndexOutOfBoundsException e){return("Name doesn't exist");}
        StringBuilder result = new StringBuilder();
        employees.forEach((employee)->
                result.append(String.format("%s\n", employee)));
        return result.toString();
    }
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList <String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        employees.forEach((employee)->
            System.out.println(employee));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an employee name to remove: ");
        String toRemove = scanner.nextLine();
        System.out.print(removeEmployee(employees, toRemove));
    }
}