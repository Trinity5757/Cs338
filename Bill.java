//Title: Bill
//Abstract: The purpose of the program is to use an algorithm to take user input to calculate a bill for an imaginary company.
//Author: Trinity Stallworth
//Date: September 12, 2023

import java.util.Scanner;

public class Bill
{
    private int min;
    private int hour;
    private int coupon;
    private double rate;
    Scanner kb = new Scanner(System.in);
    public void inputTimeWorked()
    {
        System.out.println("Enter number of full hours worked\n" +"followed by number of minutes:");
        hour = kb.nextInt();
        min = kb.nextInt();
        System.out.println("Time Worked:");
        System.out.println(hour + " hours amd " + min + " minutes");
    }

    public void updateFee()
    {
        rate = 150.00;
        System.out.println("Enter a coupon number:");
        coupon = kb.nextInt();
        if (coupon == 1234)
        {
            System.out.println("Your coupon is valid. (10% discount)");
            rate = rate-(rate*.10);
        }
        else
        {
            System.out.println("Your coupon is invalid.");
        }
        System.out.printf("Rate: $%.2f per quarter hour.\n", rate);
    }

    public void outputBill()
    {
        double total = rate*(((double) (hour * 60) /15)+((double) min /15));
        System.out.printf("Amount due: $%.2f\n", total);
    }
}
