# Author: Ahmed Maher

class Vehicle:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
    def displayInfo(self):
        return f"Brand: {self.brand} \nModel: {self.model}"
    

class Car(Vehicle):
    def __init__(self, brand, model, num_doors):
        super().__init__(brand, model)
        self.num_doors = num_doors
    
    def displayInfo(self):
        return f"{super().displayInfo()} \nNumber of doors: {self.num_doors}"
    

class Bike(Vehicle):
    def __init__(self, brand, model, numGears):
        super().__init__(brand, model)
        self.numGears = numGears
    
    def displayInfo(self):
        return f"{super().displayInfo()} \nNumber of gears: {self.numGears}"
    
myCar = Car("BMW", "X6", 4)
myBike = Bike("Porsche", "911", 2)

print(myCar.displayInfo())
print(myBike.displayInfo())