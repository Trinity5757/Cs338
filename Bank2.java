//Title: Bank2
//Author: Trinity Stallworth
//Date: September 09, 2023
//Summary: The code takes in the user input to make accounts to a bank. If the bank has three users already it will end the program.
import java.util.Scanner;

public class Bank2
{
    private Account2[] accounts = new Account2[4];
    private String bankName;
    private String getBankName;
    private int numofaccounts = 0;
    String name;
    int accnum;
    int type;
    private double balance;

    Bank2()
    {
        System.out.println(getBankName);
    }

    Scanner kb = new Scanner(System.in);
    public String setBankName(String name)
    {
        return bankName;
    }

    public boolean openAccount()
    {
        System.out.println("Enter Account Holder's Name:");
        String name = kb.next();
        System.out.println("Enter Account Holder's Account Number:");
        int accnum = kb.nextInt();
        System.out.println("Enter Account Holder's Account Balance:");
        double balance = kb.nextDouble();
        boolean temp = false;
        for (int i = 0; i < numofaccounts; i++)
        {

            if (accnum == accounts[i].getNumber() || numofaccounts == 3) {
                temp = true;
                break;
            }
        }
        if (temp)
        {
            return false;
        }
        System.out.println("Enter Account Type:");
        int type = kb.nextInt();
        System.out.println();
        accounts[numofaccounts] = new Account2(name, accnum, type, balance);
        numofaccounts++;
        return true;
    }
    public boolean closeAccount(int i)
    {
        boolean exist = false;
        for(int j = 0; j < numofaccounts; j++ )
        {
            if (accounts[j].getNumber() == i)
            {
                exist = true;
                accounts[j] = null;
                numofaccounts--;
                break;
            }
        }
        return exist;
    }
    public void printAllAccounts()
    {
        System.out.println(bankName);
        for(int i = 0; i < numofaccounts; i++ )
        {
                System.out.println(accounts[i].toString());
            if(accounts[i] != null )
            {
                System.out.println(accounts[i].toString());
                break;
            }

        }
    }

    
}
