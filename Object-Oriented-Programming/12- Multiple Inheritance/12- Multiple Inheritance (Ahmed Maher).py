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


mang = Manager("Ma7er" , 21 , 315 , "Manger" , 2200001 , "Ai" , 5 )
eng = Engineer("Ali", 25, 309, "Engineer", 2201177, "Development", "Web Engineering")

print(mang.displayInfo())
print("-" * 50)
print(mang.showTeams())
print("-" * 50)
print(eng.displayInfo())
print("-" * 50)
print(eng.showSpecialization())