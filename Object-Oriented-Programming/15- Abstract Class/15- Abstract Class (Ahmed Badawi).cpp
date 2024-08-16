#include <iostream>
using namespace std;

class Account {
public:
  double balance;
  string accountNumber;

  Account() : balance(0), accountNumber("") {}

  virtual double calculateInterest() = 0;
  double deposit(double amount) {
    return balance += amount;
  }

  double withdraw(double amount) {
    return balance -= amount;
  }
};

class SavingsAccount : public Account {
public:
  SavingsAccount(double balance, string accountNumber) {
    this -> balance = balance;
    this -> accountNumber = accountNumber;
  }

  double calculateInterest(){
    return (this -> balance * 3) / 100;
  }
};

class CheckingAccount : public Account {
public:
  CheckingAccount(double balance, string accountNumber) {
    this -> balance = balance;
    this -> accountNumber = accountNumber;
  }

  double calculateInterest(){
    return (this -> balance * 1) / 100;
  }
};

int main(){
  SavingsAccount SavingsAccount1(5000, "5624-4956-7551-4625");
  CheckingAccount checkingAccount1(3000, "1597-4658-8921-1568");

  cout << "Welcome to Saving Account\n";
  cout << "Account Number: " << SavingsAccount1.accountNumber << "\n"
      << "Balance: " << SavingsAccount1.balance << "\n"
      << "Deposit 50$: " << SavingsAccount1.deposit(50) << "$" << "\n"
      << "Withdraw 100$: " << SavingsAccount1.withdraw(100) << "$" << "\n"
      << "Interest Account Per Year: " << SavingsAccount1.calculateInterest() << " $";

  cout << "\n******************\n";

  cout << "Welcome to Checking Account\n";
  cout << "Account Number: " << checkingAccount1.accountNumber << "\n"
      << "Balance: " << checkingAccount1.balance << "\n"
      << "Deposit 100$: " << checkingAccount1.deposit(100) << "$" << "\n"
      << "Withdraw 200$: " << checkingAccount1.withdraw(200) << "$" << "\n"
      << "Interest Account Per Year: " << checkingAccount1.calculateInterest() << "$";

  return 0;
}