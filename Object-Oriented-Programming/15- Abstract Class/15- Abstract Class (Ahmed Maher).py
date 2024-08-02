# Author: Ahmed Maher
from abc import ABC, abstractmethod
class Account(ABC):
    def __init__(self, balance, accountNumber):
        self.__balance = balance
        self.__accountNumber = accountNumber
    
    @abstractmethod
    def calculateInterest(self):
        pass

    def deposit(self, amount):
        self.__balance += amount
        return f"Deposited {amount}$. New balance is {self.__balance}$"
    
    def withdraw(self, amount):
        if self.__balance >= amount:
            self.__balance -= amount
            return f"Withdrew {amount}$. New balance is {self.__balance}$"
        else:
            return f"There is not enough balance. Your current balance is {self.__balance}"
    
    def getBalance (self):
        return self.__balance

class SavingsAccount(Account):
    def __init__(self, balance, accountNumber):
        super().__init__(balance, accountNumber)
    
    def calculateInterest(self):
        return self.getBalance() * 0.03

class CheckingAccount(Account):
    def __init__(self, balance, accountNumber):
        super().__init__(balance, accountNumber)
    
    def calculateInterest(self):
        return self.getBalance() * 0.01

SA = SavingsAccount(1000, "1564-8524-9587-4557")
CHA = CheckingAccount(2000, "1568-8574-9855-8785")

print(SA.deposit(500))
print(CHA.deposit(1000))
print(SA.withdraw(200))
print(CHA.withdraw(2500))
print(CHA.withdraw(700))

print(f"Interest for SavingsAccount: {SA.calculateInterest()}")
print(f"Interest for CheckingAccount: {CHA.calculateInterest()}")