package ex31;
import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
//Example Output
//Resting Pulse: 65        Age: 22
//
//Intensity    | Rate
//-------------|--------
//55%          | 138 bpm
//60%          | 145 bpm
//65%          | 151 bpm
//:               :        (extra lines omitted)
//85%          | 178 bpm
//90%          | 185 bpm
//95%          | 191 bpm
//Constraints
//Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
//Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
//Display the results in a tabular format.
public class app31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your resting heart rate: ");
        int heartRate = scanner.nextInt();
        System.out.printf("Resting Pulse: %d        Age: %d\n", heartRate, age);
        System.out.println("Intensity    | Rate\n");
        System.out.println("-------------|--------\n");
        for(int intensity = 55; intensity <= 95; intensity+=5)
        {
            System.out.printf("%d%%          | %3.0f bpm\n", intensity, (((220.0-age)-heartRate)*(intensity/100.0))+heartRate);
        }
    }
}