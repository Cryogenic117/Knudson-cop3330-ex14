/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String text;
        double subtotal, tax=0, total;
        System.out.print("What is the order amount? ");
        text = input.nextLine();
        subtotal = Double.parseDouble(text);
        System.out.print("What is the state? ");
        text = input.next();
        if((text.compareTo("WI") == 0)) {
            tax = subtotal * 0.055;
            System.out.printf("The subtotal is $%.2f.%n", subtotal);
            System.out.printf("The tax is $%.2f.%n",tax);
        }
        total = subtotal + tax;
        System.out.printf("The total is $%.2f.", total);

    }
}
