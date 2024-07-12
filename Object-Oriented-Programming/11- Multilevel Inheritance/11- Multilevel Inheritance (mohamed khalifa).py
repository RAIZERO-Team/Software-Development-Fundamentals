class Person : 
    def __init__(self , name , age) -> None:
        self.name = name
        self.age  = age 

    def displayInfo(self) :
        print(f"Name : {self.name}")
        print(f"Age  : {self.age}")

class Employee (Person) : 
    def __init__(self, name, age , employeeID , department) -> None:
        super().__init__(name, age)
        self.employeeID = employeeID
        self.department = department

    def displayInfo(self) : 
        super().displayInfo()
        print(f"Employee ID : {self.employeeID}")    
        print(f"Department  : {self.department}")    

    def showDepartment(self) : 
        print(f"Department : {self.department}")    

class Manager (Person) : 
    def __init__(self, name, age , numTeams) -> None:
        super().__init__(name, age)
        self.numTeams = numTeams
        

    def displayInfo(self) : 
        super().displayInfo()
        print(f"Manger {self.name} mange num of Teams : {self.numTeams}")    

    def showTeams(self) : 
        print(f"Manger {self.name} mange num of Teams : {self.numTeams}")    

class Engineer (Employee) : 
    def __init__(self, name, age ,employeeID , department , specialization) -> None:
        super().__init__(name, age ,employeeID , department)
        self.specialization = specialization
        

    def displayInfo(self) : 
        super().displayInfo()
        print(f"Enaginner {self.name} specialization of {self.specialization}")    

    def showSpecialization(self) : 
        print(f"Enaginner {self.name} specialization of {self.specialization}")    


manger = Manager("Mohamed" , "44" , 2)
manger.displayInfo()
print("*" * 30)

enginner = Engineer("khalifa" , 22 , 2201220 ,"AI" , "machine learning") 
enginner.displayInfo()