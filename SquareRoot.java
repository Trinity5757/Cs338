//Title: SquareRoot
//Abstract: The purpose of the program is to use an algorithm to find the square root of a user's input.
//Author: Trinity Stallworth
//Date: September 08, 2023

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args)
    {
        System.out.println("This program estimates square roots." + "\n" + "Please enter a whole number:");
        Scanner kb = new Scanner(System.in);
        double input = 0;
        boolean shut = false;
        while (!shut)
        {
            try
            {
                input = kb.nextDouble();
                shut = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a whole number (no words, just numbers):");
                kb.next();
            }
        }
        double num1 = input /2;
        double num2 = input;
        double temp = num1;
        int count = 2;
        System.out.printf("Initial guess: %.2f\n" , num1);

        while (!(((num1 -num2)/ num1) < .01) || count == 2)
        {
            if (count == 2)
            {
                temp = num1;

            }
            else
            {
                temp = num2;

            }
            num2 = ((input/temp) + temp)/2;
            System.out.printf("Guess %d: %.6f\n", count, num2);

            num1 = temp;
            count++;
        }
        System.out.printf("The estimated square root of %.0f is %.2f", input, num2);

    }
}


//Had difficulty with the while loop