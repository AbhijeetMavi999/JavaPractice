package oops.encapsulation;

public class BankAccount {
    // private fields
    private String accountHolderName;
    private double balance;

    // constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: "+amount);
        } else {
            System.out.println("Invalid withdrawal amount or Insufficient balance");
        }
    }

    // method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: "+amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}


