import java.util.Scanner;

class BankAccounts{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    

    public BankAccounts(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayAccountInfo();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayAccountInfo();
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance:" + balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
    	BankAccounts account1 = new BankAccounts("123456", "John", 1000.0);
    	BankAccounts account2 = new BankAccounts("789012", "Don", 2000.0);

        account1.deposit(500.0);
        account2.withdraw(1000.0);
        account1.withdraw(200.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
