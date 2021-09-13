/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String nameInput = input.nextLine();

        //output
        int nameLength = nameInput.length();

        System.out.println(nameInput + " has " + nameLength + " characters.");

    }
}
