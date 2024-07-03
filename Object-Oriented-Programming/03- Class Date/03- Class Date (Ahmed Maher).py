# Author: Ahmed Maher

class Date :

    def __init__(self , day , month , year):
        self.__day = day
        self.__month = month
        self.__year = year


    def getday(self):
        return self.__day

    def setday(self , newday):
        self.__day = newday 


    def getmonth(self):
        return self.__month

    def setmonth(self , newmonth):
        self.__month = newmonth 


    def getyear(self):
        return self.__year

    def setyear(self , newyear):
        self.__year = newyear 
    
    def subtractDate(cls , date):
        date1 = cls.__day + cls.__month * 30 + cls.__year * 365
        date2 = date.__day + date.__month * 30 + date.__year * 365
        return abs(date1 - date2)

    def printDate(self):
        print(f"{self.day}/{self.month}/{self.year}")


D1 = Date(20, 6, 2018)
D2 = Date(21, 7, 2019)

D3 = D1.subtractDate(D2)
print(f"Difference in days: {D3}")
