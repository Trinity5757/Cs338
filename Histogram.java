//Title: Histogram
//Abstract: The purpose of the program is to keep track of a users input and the max amount of the same number they put in.
//Author: Trinity Stallworth
//Date: September 08, 2023
import java.util.Scanner;
public class Histogram

{
    public static void main(String[] args) {
        int[] numCounterArray = new int[10];
        int arrSize = numCounterArray.length;
        int currentNum = 0;
        int max;
        Scanner kb = new Scanner(System.in);
        System.out.println("How many input values [max: 30]?");
        int numInputs = kb.nextInt();
        System.out.printf("Enter %d numbers.%n", numInputs);

        for (int i = 0; i < numInputs; i++)
        {
            currentNum = kb.nextInt();
            numCounterArray[currentNum] = numCounterArray[currentNum] + 1;

        }
        max = numCounterArray[0];
        for (int j = 0; j < arrSize; j++)
        {
            if (numCounterArray[j] > max)
            {
                max = numCounterArray[j];
            }
        }
        System.out.println(max);

        System.out.println("========= Vertical Bar ========");

        for (int i = max; i > 0; i--)
        {
            System.out.print("| " + i + " | ");
            for (int j = 0; j < arrSize; j++) //for the stars
            {
                if (numCounterArray[j] >= i)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
                System.out.print("\n");
        }



        System.out.println("===============================");
        System.out.println("| No | 0 1 2 3 4 5 6 7 8 9");
        System.out.println("===============================");
    }
}
