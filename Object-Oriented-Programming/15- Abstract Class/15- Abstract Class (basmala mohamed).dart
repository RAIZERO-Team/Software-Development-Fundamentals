// Author: basmala mohamed
void main() {
  Account savingsAccount = SavingsAccount(89847, 909012);
  print('Savings Account'
      '\nBalance: ${savingsAccount.balance}'
      '\nAccount Number: ${savingsAccount.accountNumber}'
      '\nAfter Deposit: ${savingsAccount.deposit(1950)}'
      '\nAfter Withdraw: ${savingsAccount.withdraw(2600)}'
      '\nInterest Amount per year: ${savingsAccount.calculateInterest()}');

  print(" ");

  Account checkingAccount = CheckingAccount(540, 908013);
  print('Checking Account'
      '\nBalance: \$${checkingAccount.balance}'
      '\nAccount Number: ${checkingAccount.accountNumber}'
      '\nAfter Deposit: ${checkingAccount.deposit(350)}'
      '\nAfter Withdraw: ${checkingAccount.withdraw(150)}'
      '\nInterest Amount per year: ${checkingAccount.calculateInterest()}');
}

abstract class Account {
  double balance;
  int accountNumber;

  Account(this.balance, this.accountNumber);

  double deposit(double amount) {
    balance += amount;
    return balance;
  }

  double withdraw(double amount) {
    balance -= amount;
    return balance;
  }

  double calculateInterest();
}

class SavingsAccount extends Account {
  SavingsAccount(super.balance, super.accountNumber);

  @override
  double calculateInterest() => balance * 0.03;
}

class CheckingAccount extends Account {
  CheckingAccount(super.balance, super.accountNumber);

  @override
  double calculateInterest() => balance * 0.01;
}