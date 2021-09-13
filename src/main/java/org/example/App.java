package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
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
