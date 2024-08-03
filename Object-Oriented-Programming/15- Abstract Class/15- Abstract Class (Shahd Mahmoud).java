//Author: Shahd Mahmoud
package task15oop;

import java.text.DecimalFormat;

public class Task15oop {

    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(5000, "as11223344");
        CheckingAccount checkingAccount1 = new CheckingAccount(10000, "bc55678943");

        System.out.println(savingsAccount1.deposit(1000));
        System.out.println(checkingAccount1.deposit(1000));
        System.out.println(savingsAccount1.withdraw(500));
        System.out.println(checkingAccount1.withdraw(2500));

        System.out.println("Interest for SavingsAccount: " + savingsAccount1.calculateInterest());
        System.out.println("Interest for CheckingAccount: " + checkingAccount1.calculateInterest());
    }

}

abstract class Account {

    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract double calculateInterest();

    public String deposit(double amount) {
        balance += amount;
return "Deposited " + amount + "$. New balance is " + new DecimalFormat("#.##").format(balance) + "$";
    }

    public String withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
return "Withdrew " + amount + "$. New balance is " + new DecimalFormat("#.##").format(balance) + "$";
        } else {
            return "There is not enough balance";
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.03;
    }
}

class CheckingAccount extends Account {

    public CheckingAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }
}
