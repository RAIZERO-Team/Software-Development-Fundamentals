# Author : Motaz Dahy

from datetime import date

class Date :
  def __init__(self, day, month, year):
    self.day = day
    self.month = month
    self.year = year

  def set_day(self, day):
    self.day = day

  def get_day(self):
    return self.day

  def set_month(self, month):
    self.month = month

  def get_month(self):
    return self.month

  def set_year(self, year):
    self.year = year

  def get_year(self):
    return self.year

  def subtractDate(self, x):
    D1 = date(self.year, self.month, self.day)
    D2 = date(x.year, x.month, x.day)
    difference = D1 - D2
    return abs(difference.days)
  
  def printDate(self):
    print(self.day, self.month, self.year)


D1 = Date(20, 6, 2018)
D2 = Date(21, 7, 2019)

print(D1.subtractDate(D2))

D1.printDate()



                 







  