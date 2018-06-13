package JunitBanking;

//This class will create a bank account in which will accept the user first name and last name,
// will determine balance, and the account type :checking or savings
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKiNG = 1;
    public static final int SAVINGS  = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    //this code is a getter to get the balance
    public double getBalance() {
        return balance;
    }

    //function will determine that the account is a checking account
    public boolean isChecking() {
        return accountType == CHECKiNG;
    }
}
