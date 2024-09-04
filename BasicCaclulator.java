/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basiccaclulator;

import java.util.Scanner;

/**
 *
 * @author (Victoria Parra)
 */
public class BasicCaclulator {

     public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in); //Scanner object to scan inputs.
            String name; //Stores user's name.
            int userInput; //Stores userInput.
            double num1; //Stores first number entered.
            double num2; //Stores second number entered.
            
        
            System.out.println("Welcome to the Simple Calculator! What is your name?");
            name = scanner.nextLine(); //created a variable string name, and use scanner method to scan input
            System.out.println("Hello, " + name + ". Lets do some math!");
            System.out.println("You can perform addition, subtraction, multiplication, and divison.");
            
            //Prompt user for first number and scan it.
            System.out.println("Enter the first number.");
            num1 = scanner.nextDouble();
            
            //Prompt user for first number and scan it.
            System.out.println("Enter the second number.");
            num2 = scanner.nextDouble();
            
            //Print out numbers user entered.
            System.out.println("These are the two numbers you entered.");
            System.out.println("Number 1: " + num1 + " Number 2: " + num2);
            
            //While loop with if loop.
            //Displays a menu.
            //Allows the user to try as many options as they like with the choice to exit when they desire.
            while (true) {
                //Menu
            System.out.println("Would you like to do: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Once you are finished, enter 0 to exit.");
            System.out.println("Enter the corresponding number with the property you would like to excercise.");
            
            userInput = scanner.nextInt(); 
            
            
            if(userInput == 1 ){
                System.out.println("Adding two numbers provided.");
                System.out.println(num1 + num2);
            }
            else if (userInput == 2 ) {
                System.out.println("Subtracting two numbers provided.");
                System.out.println(num1 - num2);
            }
            else if (userInput == 3) {
                System.out.println("Multipling two numbers provided.");
                System.out.println(num1 * num2);
            }
            else if (userInput == 4) {
                System.out.println("Dividing two numbers provided.");
                System.out.println(num1 / num2);
            }
            else if (userInput == 0) {
                System.out.println("Exiting");
                System.out.println("Thank you for using the basic arithmetic calculator.");
                break;
            }
            else {
                System.out.println("Invalid input.");
            }
        }   
            //Close the scanner.
            scanner.close();
    }
}