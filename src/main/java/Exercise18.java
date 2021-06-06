/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Your choice:");
        String Choice = UserInput.nextLine();
        String choice = Choice.toUpperCase();
        if (choice.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            int Far = UserInput.nextInt();
            double FarA = (Far - 32) * (5/9);
            System.out.println("The temperature in Celsius is " + FarA);
        } else if(choice.equals("F")){
            System.out.println("Please enter the temperature in Celsius: ");
            int Cel = UserInput.nextInt();
            double CelA = (Cel * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + CelA);
        }
    }
}
