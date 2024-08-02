# Moataz Dahy

class Vehicle:
  def __init__(self, brand = '', model = ''):
    self.__brand = brand
    self.__model = model

  def display_info(self):
    print(f"Brand: {self.__brand}")
    print(f"Model: {self.__model}")

class Car(Vehicle):
  def __init__(self, brand = '', model = '', doors = 0):
    super().__init__(brand, model)
    self.__doors = doors

  def display_info(self):
    super().display_info()
    print(f"Num Of Doors: {self.__doors}")

class Bike(Vehicle):
  def __init__(self, brand = '', model = '', wheels = 0):
    super().__init__(brand, model)
    self.__wheels = wheels

  def display_info(self):
    super().display_info()
    print(f"Num Of Wheels: {self.__wheels}")

print("The Info Of Car : ")
C = Car("Kia", "Sportage", 4)
C.display_info()
print()

print("The Info Of Bike : ")
B = Bike("Honda", "CBR", 2)
B.display_info()
