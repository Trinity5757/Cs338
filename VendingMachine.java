import java.util.Scanner;
//Title: Vending Machine
//Author: Trinity Stallworth
//Date: 09/23/2023
//Purpose: To set up the amounts of items and the purchases of a vending machine
public class VendingMachine
{
    private int serialnumber;
    private int Water, Coffee, Chips, Chocolate;
    private String location;
    private int name;
    private double watercost = 1.50;
    private double coffeecost = 2.00;
    private double chipscost = 1.00;
    private double chocolatecost = 2.50;
    private double total = 0;
    private double fin = 0;
    Scanner kb =  new Scanner(System.in);
    private int selection, wateramount, coffeeamount, chipamount, chocolateamount;


    public VendingMachine(int serialNumber, String Location)
    {
        this.location = Location;
        this.serialnumber = serialNumber;
    }

    public VendingMachine(int serialNumber)
    {
        this.location = "UNKNOWN";
        this.serialnumber = serialNumber;
    }

    public void setLocation(String Location)
    {

        this.location = Location;
    }
    public void setName(int name)
    {

        this.name = name;
    }
    @Override
    public String toString()
    {

        return "SERIAL NUMBER: " + serialnumber + "\n" +  "LOCATION: " + location
                + "\n" + "Contents:" + "\n" + "  Water: " + Water + "\n" + "  Coffee: " + Coffee + "\n"
                + "  Chips: " + Chips + "\n" + "  Chocolate: " + Chocolate;
    }
    public void reset(int water, int coffee, int chips, int chocolate)
    {
        this.Water = water;
        this.Coffee = coffee;
        this.Chips = chips;
        this.Chocolate = chocolate;

    }
//The code adds items that are stated in VendingMachineDemo to the original items in the vending machine
    public void addItems(int water, int coffee, int chips, int chocolate)
    {
        Water += water;
        Coffee += coffee;
        Chips += chips;
        Chocolate += chocolate;
    }
//This code displays the cost of the items in the vending machine
    public void displayMenu()
    {
        System.out.println("===== Vending Machine Menu =====");
        System.out.printf("1. Water............$%.2f\n", watercost);
        System.out.printf("2. Coffee...........$%.2f\n", coffeecost);
        System.out.printf("3. Chips............$%.2f\n", chipscost);
        System.out.printf("4. Chocolate........$%.2f\n", chocolatecost);
    }

    public void buyItem()
    {
        System.out.println("Select an item number: ");
        selection = kb.nextInt();
        System.out.println("How many do you want to buy?");
        int amount = kb.nextInt();
        if (selection == 1)
        {
            System.out.println("You selected water. Quantity: " + amount);
            Water = Water - amount;
            wateramount = wateramount + amount;
        }
        else if (selection == 2)
        {
            System.out.println("You selected coffee. Quantity: " + amount);
            Coffee = Coffee - amount;
            coffeeamount = wateramount + amount;
        }
        else if (selection == 3)
        {
            System.out.println("You selected chips. Quantity: " + amount);
            Chips = Chips -amount;
            chipamount += amount;
        }
        else if (selection == 4)
        {
            System.out.println("You selected chocolate. Quantity: " + amount);
            Chocolate = Chocolate - amount;
            chocolateamount += amount;
        }
    }
    public boolean buyItem(int selection, int amount)
    {
        boolean temp = false;
        System.out.println("Select an item number: " + selection);
        System.out.println("How many do you want to buy? " + amount);
        if (selection == 1)
        {
            System.out.println("You selected water. Quantity: " + amount);

            if (amount > Water)
            {
                System.out.println("Selection failed. We do not have enough water.");
            }
            else
            {
                wateramount = amount + wateramount;
                Water -=wateramount;
                temp = true;
            }

        }
        else if (selection == 2)
        {
            System.out.println("You selected coffee. Quantity: " + amount);
            if(amount > Coffee)
            {
                System.out.println("Selection failed. We do not have enough coffee.");
            }
            else
            {
                coffeeamount = coffeeamount + amount;
                Coffee -=coffeeamount;
                temp = true;
            }
        }
        else if (selection == 3)
        {
            System.out.println("You selected chips. Quantity: " + amount);
            if(amount > Chips)
            {
                System.out.println("Selection failed. We do not have enough chips.");
            }
            else
            {
                chipamount = chipamount + amount;
                Chips -=chipamount;
                temp = true;
            }
        }
        else if (selection == 4)
        {
            System.out.println("You selected chocolate. Quantity: " + amount);
            if(amount > Chocolate)
            {
                System.out.println("Selection failed. We do not have enough chocolate.");
            }
            else
            {
                chocolateamount = chocolateamount + amount;
                Chocolate -=chocolateamount;
                temp = true;
            }
        }
        return temp;
    }
    public void returned(int selection, int amount)
    {
        if (selection == 1)
        {
            System.out.println("You selected water. Quantity: " + amount);
            wateramount -= amount;
            Water = Water + amount;
        }
        else if (selection == 2)
        {
            System.out.println("You selected coffee. Quantity: " + amount);
            coffeeamount -= amount;
            Coffee = Coffee + amount;
        }
        else if (selection == 3)
        {
            System.out.println("You selected chips. Quantity: " + amount);
            chipamount -= amount;
            Chips = Chips + amount;
        }
        else if (selection == 4)
        {
            System.out.println("You selected chocolate. Quantity: " + amount);
            chocolateamount -= amount;
            Chocolate = Chocolate + amount;
        }
    }
    public boolean payment()
    {
        total = (watercost*wateramount) + (coffeecost*coffeeamount) + (chipscost*chipamount) + (chocolatecost*chocolateamount);
        boolean temp1 = false;
        System.out.print("Enter money amount: $");
        double money = kb.nextDouble();
        if (money < total)
        {
            System.out.printf("Insufficient money. $%.2f returned", money);
        }
        else if (money >= total)
        {
            System.out.println(total);
            double shut = money - (total + (total * .10));
            System.out.printf("Sufficient money. $%.2f returned", shut);
            temp1 = true;
        }
        return temp1;
    }

    public void displayReceipt()
    {
        double butch = 0;
        if (Water != 0)
        {
            butch = watercost*wateramount;
            System.out.printf("Water: $%.2f X %d = $%.2f\n", watercost, wateramount, butch);
        }
        else if (Coffee != 0)
        {
            butch = coffeecost*coffeeamount;
            System.out.printf("Coffee: $%.2f X %d = $%.2f\n", coffeecost, coffeeamount, butch);
        }
        else if (Chips != 0)
        {
            butch =  chipscost*chipamount;
            System.out.printf("Chips: $%.2f X %d = $%.2f\n", chipscost, chipamount, butch);
        }
        else if (Chocolate != 0)
        {
            butch =  chocolatecost*chocolateamount;
            System.out.printf("Chocolate: $%.2f X %d = $%.2f\n", chocolatecost, chocolateamount, butch);
        }
        double tax = total*.10;
        fin = total + tax;
        System.out.println("Tax (10.0%): $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",fin));
    }

    public void status()
    {
        System.out.println("Serial Number: " + serialnumber);
        System.out.println("Location: " + location);
        System.out.println("Sold Items:");
        System.out.println("  Water: " + wateramount);
        System.out.println("  Coffee: " + coffeeamount);
        System.out.println("  Chips: " + chipamount);
        System.out.println("  Chocolate: " + chocolateamount);
        System.out.println("Current Contents:");
        System.out.println("  Water: " + Water);
        System.out.println("  Coffee: " + Coffee);
        System.out.println("  Chips: " + Chips);
        System.out.println("  Chocolate: " + Chocolate);
        System.out.println("Total Earnings: $" + String.format("%.2f",fin));
    }
}
