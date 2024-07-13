# Moataz Dahy

class Fraction:
    def __init__(self, numerator=None, denominator=None):
        self.__numerator = numerator
        self.__denominator = denominator
        self.check_denominator()

    def check_denominator(self):
        if self.__denominator == 0:
            print("Denominator cannot be zero")

    def set_numerator(self, numerator):
        self.__numerator = numerator

    def get_numerator(self):
        return self.__numerator

    def set_denominator(self, denominator):
        self.__denominator = denominator
        self.check_denominator()

    def get_denominator(self):
        return self.__denominator

    def __str__(self):
        return f"{self.__numerator}/{self.__denominator}"

    def __add__(self, other):
        numerator = (self.__numerator * other.get_denominator()) + (other.get_numerator() * self.__denominator)
        denominator = self.__denominator * other.get_denominator()
        return Fraction(numerator, denominator)

    def __sub__(self, other):
        numerator = (self.__numerator * other.get_denominator()) - (other.get_numerator() * self.__denominator)
        denominator = self.__denominator * other.get_denominator()
        return Fraction(numerator, denominator)

    def __mul__(self, other):
        numerator = self.__numerator * other.get_numerator()
        denominator = self.__denominator * other.get_denominator()
        return Fraction(numerator, denominator)

    def __truediv__(self, other):
        numerator = self.__numerator * other.get_denominator()
        denominator = self.__denominator * other.get_numerator()
        return Fraction(numerator, denominator)

    def __eq__(self, other):
        return (self.__numerator * other.get_denominator()) == (self.__denominator * other.get_numerator())

    def __ne__(self, other):
        return (self.__numerator * other.get_denominator()) != (self.__denominator * other.get_numerator())


n1Num = 2
n1Den = 3

n2Num = 1
n2Den = 2

n1 = Fraction(n1Num, n1Den)
n2 = Fraction(n2Num, n2Den)

print(f"First fraction: {n1}")
print(f"Second fraction: {n2}")

n3 = n1 + n2
print(f"Addition: {n3}")

n3 = n1 - n2
print(f"Subtraction: {n3}")

n3 = n1 * n2
print(f"Multiplication: {n3}")

n3 = n1 / n2
print(f"Division: {n3}")

print(f"Equality: {n1 == n2}")
print(f"Not Equality: {n1 != n2}")
