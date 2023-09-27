//Title: Bank2Test_1
//Author: Trinity Stallworth
//Date: September 09, 2023
//Summary: A test program for Account2 and Bank2
public class Bank2Test_1
{
    public static void main(String[] args)
    {

        Bank2 testBank = new Bank2();
        //The bank name
        testBank.setBankName("Monterey Bay");
        // Input: Name: "Bob", Number: 2785,
        // Type: 1, Balance: 2089.95
        // Input: Name: "Linda", Number: 1984,
        // Type: 1, Balance: 3068.00
        // Input: Name: "Lisa", Number: 2000,
        // Type: 2, Balance: 348.20
        // Input: Name: "Steve", Number: 2020,
        // Type: 1, Balance: 00.01
        //Loops through the user input until it reaches the maximum of three
        for (int i =0; i < 4; i++)
        {
            testBank.openAccount();
        }

        //The account prints all of the information onto the screen
        testBank.printAllAccounts();
        //Close the account if the same account number of 2789 is inputted
        System.out.println(testBank.closeAccount(2789));
        //Prints the account even if the close account is reached
        testBank.printAllAccounts();
    }
}
