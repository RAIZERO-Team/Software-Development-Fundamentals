"""Moataz Dahy"""
from abc import ABC, abstractmethod

class Account(ABC):
    
  def __init__(self, balance, accountnumber):
    self.balance = balance
    self.accountnumber = accountnumber
    
  @abstractmethod
  def calcuate_interest(self):
    pass

  def deposit(self, amount):
    self.balance += amount
    return self.balance

  def withdraw(self, amount):
    if self.balance >= amount:
      self.balance -= amount
    else:
        return "Insufficient balance"
      
  def get_balance(self):
    return self.balance
    
class SavingsAccount(Account):
  def __init__(self, balance, accountnumber):
    super().__init__(balance, accountnumber)

  def calcuate_interest(self):
    return self.balance * (3/100)


class CheckingAccount(Account):
  def __init__(self, balance, accountnumber):
    super().__init__(balance, accountnumber)

  def calcuate_interest(self):
    return self.balance * (1/100)



S = SavingsAccount(1000, "3020-1425-5465-1222")
C = CheckingAccount(2000, "1224-1564-7894-1456")

S.deposit(100)
S.withdraw(50)

C.deposit(100)
C.withdraw(50)

print(f"Saving Account: {S.calcuate_interest()}")
print(f"Checking Account: {C.calcuate_interest()}")


  

 
    
  