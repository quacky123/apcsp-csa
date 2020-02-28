package fun.Lab8_5;

// Aadi Jain
import java.util.Scanner;

public class APBankRun {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                   //creating variables necessary for work

        String firstName, lastName, acctin, searchin, search;
        String firstIn, lastIn, nameIn;
        double balance, balIn;
        int acctnum, acctIn;
        boolean m=true;
        
        APBank a=new APBank();

        while (m==true) // main loop that drives everything
        {
            System.out.println("---------------------------------------------------------------------------------------------------------------");        
            System.out.println();
            System.out.println("Enter option :----> ");        
            System.out.print("N - to create a New Account, S - to search, m - to Exit : ");       
            acctin = scan.next().toLowerCase();

            if (acctin.equals("n")) {
                System.out.print("Enter First Name : ");              // Enter first name
                firstName = scan.next();

                System.out.print("Enter Last Name: ");              // Enter last name
                lastName = scan.next();

                System.out.print("Enter the Account Balance: ");        // Enter balance
                balance = scan.nextDouble();

                while (balance < 0.0)  {
                    System.out.print("Enter a Account Balance ( >=0): ");
                    balance = scan.nextDouble();
                }

                // Creating an account 
                acctnum = a.addAccount(firstName, lastName, balance);
                System.out.println("Great. Here is Account Number: " + acctnum);                                                                    
            }
            else if (acctin.equals("s")) {
                    System.out.print("How would you like to search for your account. Fullname -N, AccountNumber -A, FirstName- F, LastName -L, Balance-B: ");
                    searchin = scan.next().toLowerCase();
                    
                    if (searchin.equals("a")) {
                        System.out.print("Enter the account number: ");
                        acctIn = scan.nextInt();
                        System.out.print(a.search(acctIn));
                    } else if (searchin.equals("f")) {                                // Different ways to search
                        System.out.print("Enter the first name: ");
                        firstIn = scan.next().toLowerCase();
                        System.out.print(a.searchFirst(firstIn));
                    } else if (searchin.equals("l")) {
                        System.out.print("Enter the last name: ");
                        lastIn = scan.next().toLowerCase();
                        System.out.print(a.search(lastIn));
                    } else if (searchin.equals("b")) {
                        System.out.print("Enter the balance: ");
                        balIn = scan.nextDouble();
                        System.out.println(a.search(balIn));
                    } 
                    else if (searchin.equals("n")) {
                        System.out.print("Enter the full name - first name and last name separated by space: ");
                        firstIn=scan.next().toLowerCase();
                        lastIn = scan.next().toLowerCase();
                        System.out.println(a.search( firstIn, lastIn ));
                    }    
                }
            else if (acctin.equals("m")){
                System.exit(0);
            }
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------------------");        
        }
    }
}
