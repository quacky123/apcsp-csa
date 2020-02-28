package fun.Lab8_5;

// Aadi Jain
public class Account {

    int acctNumber;
    String firstName, lastName;
    double balance;
    
    public Account(int accountNumber, String fName, String lName, double Bal) {
        acctNumber=accountNumber;
        firstName=fName;
        lastName=lName;
        balance=Bal;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void setAcctNumber(int acctNum) {
        acctNumber = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAcctNumber() {
        return acctNumber;
    }


    public String toString() {            
        return ("Account: " + acctNumber + ", Name: " + firstName + " " + lastName + ", Balance: $" +  balance + ".");
    }

}
