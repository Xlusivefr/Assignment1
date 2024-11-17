/*
 * Class: CMSC203
 * Instructor: Dr.Grinberg
 * Description: This program tests the ESP skills by asking to guess a randomly selected color.
 * Due: 11/16/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Jedidiah Dawit
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        // Constants for color names
        final String COLOR1 = "black";
        final String COLOR2 = "white";
        final String COLOR3 = "gray";
        final String COLOR4 = "silver";
        final String COLOR5 = "maroon";
        final String COLOR6 = "red";
        final String COLOR7 = "purple";
        final String COLOR8 = "fuchsia";
        final String COLOR9 = "green";
        final String COLOR10 = "lime";
        final String COLOR11 = "olive";
        final String COLOR12 = "yellow";
        final String COLOR13 = "navy";
        final String COLOR14 = "blue";
        final String COLOR15 = "teal";
        final String COLOR16 = "aqua";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctGuesses = 0;

        // Display colors from the file
        System.out.println("Enter the filename: colors.txt");
        System.out.println("There are sixteen colors from a file:");
        System.out.println("1 black\n2 white\n3 gray\n4 silver\n5 maroon\n6 red");
        System.out.println("7 purple\n8 fuchsia\n9 green\n10 lime\n11 olive");
        System.out.println("12 yellow\n13 navy\n14 blue\n15 teal\n16 aqua");

        // Repeat the game for three rounds
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");

            // Generate a random number between 1 and 16
            int randomNumber = random.nextInt(16) + 1;
            String selectedColor = "";

            // Use a switch statement to assign the selected color
            switch (randomNumber) {
                case 1: selectedColor = COLOR1; break;
                case 2: selectedColor = COLOR2; break;
                case 3: selectedColor = COLOR3; break;
                case 4: selectedColor = COLOR4; break;
                case 5: selectedColor = COLOR5; break;
                case 6: selectedColor = COLOR6; break;
                case 7: selectedColor = COLOR7; break;
                case 8: selectedColor = COLOR8; break;
                case 9: selectedColor = COLOR9; break;
                case 10: selectedColor = COLOR10; break;
                case 11: selectedColor = COLOR11; break;
                case 12: selectedColor = COLOR12; break;
                case 13: selectedColor = COLOR13; break;
                case 14: selectedColor = COLOR14; break;
                case 15: selectedColor = COLOR15; break;
                case 16: selectedColor = COLOR16; break;
            }

            // Prompt user for a guess
            System.out.println("Is it one of the colors listed above?");
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().trim().toLowerCase();

            // Compare user guess with the selected color
            if (userGuess.equals(selectedColor)) {
                System.out.println("I was thinking of " + selectedColor + ".");
                correctGuesses++;
            } else {
                System.out.println("I was thinking of " + selectedColor + ".");
            }
        }

        // Display the result
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        System.out.print("Due Date (MM/DD/YY): ");
        String dueDate = scanner.nextLine();

        // Display user information
        System.out.println("\nUser Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);

        // Print the programmer's name
        System.out.println("\nProgrammed by Jedidiah Dawit");

        // Close the scanner
        scanner.close();
    }
}
