class Date :
    def __init__(self , day , month , year) :
        self.__day = day 
        self.__month = month 
        self.__year = year

    def setDay(cls , day):
        cls.__day = day     
    def setMonth(cls , month):
        cls.__month = month
    def setYear(cls , year):
        cls.__year = year 
    
    def getDay(cls):
        return cls.__day
    def getMonth(cls):
        return cls.__month
    def getYear(cls):
        return cls.__year
    
    def subtractDate(cls , date):
        days  = cls.__day + cls.__month * 30 + cls.__year * 365
        days -= date.__day + date.__month * 30 + date.__year * 365
        return abs(days)

    def printDate(cls):
        print(f"{cls.__day}/{cls.__month}/{cls.__year}")


date  = Date(20 , 6 , 2018)  
date1 = Date(21 , 7 , 2019)

print(date.subtractDate(date1))
date.printDate()


