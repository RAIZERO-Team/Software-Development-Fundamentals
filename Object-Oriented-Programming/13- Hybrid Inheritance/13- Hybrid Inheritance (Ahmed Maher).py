# Author: Ahmed Maher

class Person:
    def __init__(self, name=None, age=0):
        self.__name = name
        self.__age = age
    
    def displayPersonInfo(self):
        return f"Name: {self.__name} \nAge: {self.__age}"

class Worker:
    def __init__(self, workerID, role):
        self.__workerID = workerID
        self.__role = role
    
    def displayWorkerInfo(self):
        return f"Worker ID: {self.__workerID} \nRole: {self.__role}"

class Employee(Person, Worker):
    def __init__(self, name, age, workerID, role, employeeID, department):
        Person.__init__(self, name, age)
        Worker.__init__(self, workerID, role)
        self.__employeeID = employeeID
        self.__department = department
    
    def displayPersonInfo(self):
        return f"{Person.displayPersonInfo(self)}\nEmployee ID: {self.__employeeID}\nDepartment: {self.__department}"
    
    def displayWorkerInfo(self):
        return f"{Worker.displayWorkerInfo(self)}"
    
    def showDepartment(self):
        return f"Department: {self.__department}"
    
    def displayInfo(self):
        return f"{self.displayPersonInfo()}\n{self.displayWorkerInfo()}"

class Contractor(Person, Worker):
    def __init__(self, name, age, workerID, role, contractDuration, project):
        Person.__init__(self, name, age)
        Worker.__init__(self, workerID, role)
        self.__contractDuration = contractDuration
        self.__project = project
    
    def displayPersonInfo(self):
        return f"{Person.displayPersonInfo(self)}\ncontract Duration: {self.__contractDuration}\nproject: {self.__project}"
    
    def displayWorkerInfo(self):
        return f"{Worker.displayWorkerInfo(self)}"
    
    def showProject(self):
        return f"project: {self.__project}"
    
    def displayInfo(self):
        return f"{self.displayPersonInfo()}\n{self.displayWorkerInfo()}"

class Manager(Employee):
    def __init__(self, name, age, workerID, role, employeeID, department, numTeams):
        Employee.__init__(self, name, age, workerID, role, employeeID, department)
        self.__numTeams = numTeams
    
    def displayInfo(self):
        return f"{Employee.displayInfo(self)}\nNumber of Teams Managed: {self.__numTeams}"
    
    def showTeams(self):
        return f"Number of Teams Managed: {self.__numTeams}"

class Engineer(Employee):
    def __init__(self, name, age, workerID, role, employeeID, department, specialization):
        Employee.__init__(self, name, age, workerID, role, employeeID, department)
        self.__specialization = specialization
    
    def displayInfo(self):
        return f"{Employee.displayInfo(self)}\nSpecialization: {self.__specialization}"
    
    def showSpecialization(self):
        return f"Specialization: {self.__specialization}"

class Freelancer(Contractor):
    def __init__(self, name, age, workerID, role, contractDuration, project , hourlyRate):
        Contractor.__init__(self, name, age, workerID, role, contractDuration, project)
        self.__hourlyRate = hourlyRate
    
    def displayInfo(self):
        return f"{Contractor.displayInfo(self)}\nHourly Rate: {self.__hourlyRate} $"
    
    def showHourlyRate(self):
        return f"Hourly Rate: {self.__hourlyRate} $ "


mang = Manager("Ma7er" , 21 , 315 , "Manger" , 2200001 , "Ai" , 5 )
eng = Engineer("Ali", 25, 309, "Engineer", 2201177, "Development", "Web Engineering")
frlanc = Freelancer("ziad" , 19 ,305 , "Freelancer" , 5 , "stavital" , 75.5 )


print("--- Manager Info ---")
print(mang.displayInfo())
print("-" * 50)
print(mang.showTeams())
print("-" * 50)
print("\n--- Engineer Info ---")
print(eng.displayInfo())
print("-" * 50)
print(eng.showSpecialization())
print("-" * 50)
print("\n--- Freelancer Info ---")
print(frlanc.displayInfo())
print("-" * 50)
print(frlanc.showHourlyRate())
print("-" * 50)