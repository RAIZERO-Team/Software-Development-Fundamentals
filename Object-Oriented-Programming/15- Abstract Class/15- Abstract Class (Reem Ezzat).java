// Author: Reem Ezzat

public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
        
        SavingAccount account1=new SavingAccount(10005, "2321111404");
        CheckingAccount account2=new CheckingAccount(20050, "5433332145");
        
        System.out.println("Saving Account"+
                "\nBalance: "+account1.balance+" $"+   "   Account Number: "+account1.accountNumber+
                "\nAfter Deposit: "+account1.deposit(15)+" $"+
                "\nAfter Withdraw: "+account1.withdraw(20)+" $"+
                "\nInterest Amount per year : "+account1.calculateInterest()+" $"+
                   "\n-------------------\nChecking Account"+
                "\nBalance: "+account2.balance+" $"+   "   Account Number: "+account2.accountNumber+
                "\nAfter Deposit: "+account2.deposit(15)+" $"+                        //20065
                "\nAfter Withdraw: "+account2.withdraw(20)+ " $"+                    //20045
                "\nInterest Amount per year : "+account2.calculateInterest()+" $"         //200.45
        
        
        
           );


        
       
} }
abstract class Account{
public double balance;
public String accountNumber;

 public Account(double Balance,String AccountNum){
    this.balance=Balance;
    this.accountNumber=AccountNum;

}

   

    
 
 double deposit(double amount){
 
 return balance=balance+amount;
 }
 double withdraw(double amount){
 
 return balance=balance-amount;
 }
 abstract double calculateInterest();

}
class SavingAccount extends Account{

    public SavingAccount(double Balance,String AccountNum) {
        super(Balance, AccountNum);
    }

   



    @Override
double calculateInterest(){
    
double interest= (balance*3)/100;
return interest;
}

}
class CheckingAccount extends Account{

    public CheckingAccount(double Balance,String AccountNum) {
     super(Balance, AccountNum);
    }

    @Override
 double calculateInterest(){
double interest=(balance*1)/100;
return interest;
}


}