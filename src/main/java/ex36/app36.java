package ex36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.
//
//Example Output
//Enter a number: 100
//Enter a number: 200
//Enter a number: 1000
//Enter a number: 300
//Enter a number: done
//Numbers: 100, 200, 1000, 300
//The average is 400.0
//The minimum is 100
//The maximum is 1000
//The standard deviation is 353.55
//Constraints
//Use functions called average, max, min, and std, which take in a list of numbers and return the results.
//Use loops and arrays to perform the input and mathematical operations.
//Be sure to exclude the "done" entry from the inputs.
//Be sure to properly ignore any invalid inputs.
//Keep the input separate from the processing and the output.
public class app36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
            if (input.equals("done")) {
                break;
            }
            numbers.add(Double.parseDouble(input));
        }
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.size(); ++i) {
            if (i > 0) {
                System.out.print(", " + numbers.get(i));
            } else {
                System.out.print(numbers.get(i));

            }
        }
        System.out.println("");
        System.out.println("The average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.println("The standard deviation is "+ STD(numbers));

    }

    public static double average(ArrayList<Double> v) {
        double sum = 0;
        int n = 0;
        for (n = 0; n < v.size(); ++n) {
            sum += v.get(n);
        }
        if (n > 0) {
            return sum / n;
        }
        return 0;
    }

    public static double min(ArrayList<Double> v) {
        double minimum = Double.MAX_VALUE;
        int n = 0;
        for (n = 0; n < v.size(); ++n) {
            if (v.get(n) < minimum) {
                minimum = v.get(n);
            }
        }
        return minimum;
    }

    public static double max(ArrayList<Double> v) {
        double maximum = Double.MIN_VALUE;
        int n = 0;
        for (n = 0; n < v.size(); ++n) {
            if (v.get(n) > maximum) {
                maximum = v.get(n);
            }
        }
        return maximum;
    }

    public static double STD(ArrayList<Double> v) {
        double sum = 0;
        double sumsq = 0;
        int n = 0;
        for (n = 0; n < v.size(); ++n) {
            sum += v.get(n);
            sumsq += v.get(n)*v.get(n);
        }
        if (n > 0) {
            double mean = sum / n;
            return Math.sqrt((sumsq / n) - (mean*mean));
        }
        return 0;
    }
}