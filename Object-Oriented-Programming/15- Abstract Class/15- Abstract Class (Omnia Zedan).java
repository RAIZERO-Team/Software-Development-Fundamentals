//Author:omnia zedan
    
abstract class Account {
    protected double balance;
    protected String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract double calculateInterest();

    public double deposit(double amount) {
        return balance +=amount;
       
    }

    public double withdraw(double amount) {
      
           return balance -= amount;
        
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    private static final double interest = 0.03; 

    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public double calculateInterest() {
        return balance * interest;
    }
}

class CheckingAccount extends Account {
    private static final double interest = 0.01; 

    public CheckingAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public double calculateInterest() {
        return balance * interest;
    }
}
public class main{
public static void main(String[] args) {
         SavingsAccount savings = new SavingsAccount(1000, "S123");
        CheckingAccount checking = new CheckingAccount(500, "C456");

       
      System.out.println(  savings.deposit(200));
        System.out.println( savings.withdraw(150));
        System.out.println( checking.deposit(100));
       System.out.println(  checking.withdraw(50));

        
        System.out.println("savings account interest: " + savings.calculateInterest());
        System.out.println("checking account interest: " + checking.calculateInterest());
    }}

