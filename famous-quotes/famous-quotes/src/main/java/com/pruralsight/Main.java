package com.pruralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "Believe in yourself.",
                "Never give up.",
                "Dream big.",
                "Stay positive.",
                "Keep moving forward.",
                "Hard work pays off.",
                "Learn from mistakes.",
                "Success takes time.",
                "Be yourself.",
                "Stay focused.",

        };

        System.out.print("Enter a number of 10 quotes: ");
        Scanner myScanner = new Scanner(System.in);
        int usersChoice = myScanner.nextInt();
        int quoteIndex = 10;
            try {
                for (int i = 0; i < quotes.length; i++) {
                    if (usersChoice == i)
                        System.out.println(quotes[i - 1]);
                }
                if (usersChoice < 1 || usersChoice > quotes.length) {
                    System.out.println(quotes[usersChoice - 1]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Please enter a number between 1 and 10!");
            }
            System.out.print("Try Again");
    }
}



