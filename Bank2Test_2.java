//Title: Bank2Test_2
//Author: Trinity Stallworth
//Date: September 09, 2023
//Summary: A test program for Account2 and Bank2
public class Bank2Test_2 {

    public static void main(String[] args)
    {

        Bank2 testBank = new Bank2();
        //The bank name
        testBank.setBankName("Random Bad Bank");

        // Input: Name: "Allison", Number: 1919,
        // Type: 1, Balance: 60.28
        testBank.openAccount();
        // Input: Name: "Church", Number: 1888,
        // Type: 1, Balance: 20.75
        testBank.openAccount();

        //Prints all of the accounts
        testBank.printAllAccounts();
        //If the user inputs the same account number of 2024 then the account will close
        System.out.println(testBank.closeAccount(2024));
        //Prints the accounts even if the account number has been reached
        testBank.printAllAccounts();
    }

}

