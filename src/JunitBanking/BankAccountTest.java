package JunitBanking;

import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {

    //this test will use assertEqual to demonstrate that the balance after a deposit is correct
    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Christian", "Mena", 1000.00, BankAccount.CHECKiNG);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    //this test will use the assertNotEquals to demonstrate that the balance after a withdraw is not correct
    @org.junit.Test
    public void withdraw() {
        BankAccount account = new BankAccount("Christian", "Mena", 1000.00, BankAccount.CHECKiNG);
        account.withdraw(20.00, true);
        assertNotEquals(1000.00, account.getBalance(), 0);
    }

    //this test will use the assertNotEquals to demonstrate that the balance after a deposit is not equal
    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Christian", "Mena", 1000.00, BankAccount.CHECKiNG);
        account.deposit(200.00, false);
        assertNotEquals(1000.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKiNG);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

}