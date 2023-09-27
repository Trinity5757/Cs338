//Title: Account2
//Author: Trinity Stallworth
//Date: September 09, 2023
//Summary: The code establishes the name, number, type, and balance of the account holder.
public class Account2 {

    private String name;
    private int number;
    private int type;
    private double balance;

    public Account2(String name, int number, int type, double balance)
    {
        this.name = name;
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public boolean deposit(double fund) {
        if (fund < 0.0) {
            System.out.println("Error: no negative amount to deposit.");
            return false;
        } else {
            balance += fund;
            return true;
        }
    }

    public boolean withdrawal(double fund) {
        if (fund > balance) {
            System.out.println("Error: insufficient balance to withdraw.");
            return false;
        } else {
            balance -= fund;
            return true;
        }
    }

    public int getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format("Name: " + name + ", Number: " + number + ", Type: " + type + ", Balance: " + balance);
    }

}