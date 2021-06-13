package ex32;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Let's play Guess the Number!
//
//Enter the difficulty level (1, 2, or 3): 1
//I have my number. What's your guess? 5
//Too low. Guess again: 7
//Too low. Guess again: 9
//You got it in 3 guesses!
//
//Do you wish to play again (Y/N)? y
//
//Enter the difficulty level (1, 2, or 3): 3
//I have my number. What's your guess? 500
//Too low. Guess again: 750
//Too high. Guess again: 600
//Too low. Guess again: 700
//Too low. Guess again: 725
//Too high. Guess again: 715
//Too high. Guess again: 710
//Too high. Guess again: 705
//Too high. Guess again: 701
//Too low. Guess again: 702
//You got it in 10 guesses!
//
//Do you wish to play again (Y/N)? n
public class app32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Guess the Number! ");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int level = scanner.nextInt();
        int maxValue = (int)Math.pow(10, level);
        int value = (int)(Math.random() * maxValue);
        int guess;
        System.out.print("I have my number. What's your guess? ");
        int numberOfGuesses = 0;
        do
        {
            guess = scanner.nextInt();
            if(guess < value)
            {
                System.out.print("Too low. Guess again: ");

            }
            else if (value < guess)
            {
                System.out.print("Too high. Guess again: ");
            }
            numberOfGuesses++;
        }while(value != guess);
        System.out.printf("You got it in %d guesses!\n", numberOfGuesses);
    }
}