class Vehicle : 
    def __init__(self , brand , model) -> None:
        self.brand = brand
        self.model = model

    def displayInfo(self) :
        print(f"Brand : {self.brand}")    
        print(f"Model : {self.model}")    

class Car (Vehicle): 
    def __init__(self , brand , model , num_of_doors) -> None:
        super().__init__(brand , model)
        self.num_of_doors = num_of_doors

    def displayInfo(self) :
        super().displayInfo()
        print(f"num of doors : {self.num_of_doors}")


class Bike (Vehicle): 
    def __init__(self , brand , model , numGears) -> None:
        super().__init__(brand , model)
        self.numGears = numGears

    def displayInfo(self) :
        super().displayInfo()
        print(f"num of Gears : {self.numGears}")



car1 = Car("TOYOTA" , "toyota corolla" , 4)
car1.displayInfo()
print("#" * 50)

bike1 = Bike("gomma" , "gommaAPS2019" , 2)
bike1.displayInfo()
                    



































