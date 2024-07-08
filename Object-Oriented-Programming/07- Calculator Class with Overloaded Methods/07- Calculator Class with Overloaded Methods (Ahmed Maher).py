class Calculator:

    def add(self , *args):
        sum = 0
        for i in (args):
            sum += i
        return sum

s1 = Calculator()
print(s1.add(50 , 20 , 30 , 200))
