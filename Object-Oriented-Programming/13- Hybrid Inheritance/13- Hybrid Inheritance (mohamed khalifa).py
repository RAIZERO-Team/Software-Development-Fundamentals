class Person : 
    def __init__(self , name , age) -> None:
        self.name = name
        self.age  = age 

    def displayInfo(self) :
        print(f"Name : {self.name}")
        print(f"Age  : {self.age}")


class Worker  : 
    def __init__(self, workerID, role) -> None:
        self.workerID = workerID
        self.role = role

    def displayWorkerInfo(self) : 
        print(f"Worker ID : {self.workerID}")    
        print(f"Role      : {self.role}") 

class Employee (Person , Worker) : 
    def __init__(self, name,  age , workerID, role ,  employeeID , department) -> None:
        super().__init__(name, age)
        # super().__init__(workerID , role)
        Worker.__init__(self , workerID , role)
        self.employeeID = employeeID
        self.department = department

    def displayInfo(self) : 
        super().displayInfo()
        super().displayWorkerInfo()
        print(f"Employee ID : {self.employeeID}")    
        print(f"Department  : {self.department}")  

    def displayPersonInfo(self):
        super().displayPersonInfo()
        print(f"Employee ID : {self.employeeID}")    
        print(f"Department  : {self.department}")  

    def displayWorkerInfo(self) :
        super().displayWorkerInfo()
        print(f"Employee ID : {self.employeeID}")    
        print(f"Department  : {self.department}") 


    def showDepartment(self) : 
        print(f"Department : {self.department}")    

class Contractor (Person , Worker) : 
    def __init__(self, name, age , workerID, role , contractDuration ,project ) -> None:
        super().__init__(name, age)  
        Worker.__init__(self , workerID , role)
        self.contractDuration = contractDuration
        self.project = project

    def displayPersonInfo(self):
        super().displayPersonInfo()
        print(f"contract duration in month : {self.contractDuration}")
        print(f"Project : {self.project}")

    def displayWorkerInfo(self) :
        super().displayWorkerInfo()
        print(f"contract duration in month : {self.contractDuration}")
        print(f"Project : {self.project}")

    def showProject(self) :
        print(f"{self.project} in {self.contractDuration} monthes")

    def displayInfo(self) : 
        super().displayInfo()
        super().displayWorkerInfo()   
        print(f"contract duration in month : {self.contractDuration}")
        print(f"Project  : {self.project}") 

class Manager (Employee) : 
    def __init__(self, name, age ,workerID, role ,  employeeID , department ,numTeams) -> None:
        super().__init__(name, age ,workerID, role ,  employeeID , department)
        self.numTeams = numTeams
        

    def displayInfo(self) : 
        super().displayInfo()
        print(f"Manger {self.name} mange num of Teams : {self.numTeams}")    

    def showTeams(self) : 
        print(f"Manger {self.name} mange num of Teams : {self.numTeams}")    

class Engineer (Employee) : 
    def __init__(self, name, age ,workerID, role ,employeeID , department , specialization) -> None:
        super().__init__(name, age , workerID, role ,employeeID , department)
        self.specialization = specialization
        

    def displayInfo(self) : 
        super().displayInfo()
        print(f"Enaginner {self.name} specialization of {self.specialization}")    

    def showSpecialization(self) : 
        print(f"Enaginner {self.name} specialization of {self.specialization}")    


class Freelancer (Contractor) : 
    def __init__(self, name, age , workerID, role , contractDuration ,project , hourlyRate) -> None:
        super().__init__(name, age , workerID, role ,contractDuration ,project) 
        self.hourlyRate = hourlyRate

    def displayInfo(self) : 
        super().displayInfo()
        print(f"hourlyRate : {self.hourlyRate}")    

    def showHourlyRate(self) : 
        print(f"hourlyRate : {self.hourlyRate}")     

manger = Manager("Mohamed" , 44 , 2122 , "project manger" , 12220 , "database section" , 2)
manger.displayInfo()
print("*" * 30)

enginner = Engineer("khalifa" , 22 , 220 ,"technicl support" , 223440,"development" , "machine learning") 
enginner.displayInfo()    
print("*" * 30)

freelancer = Freelancer("ahmed" , 22 , 234211 ,  3 , 5 , "octodo" , 2.3)
freelancer.displayInfo()

