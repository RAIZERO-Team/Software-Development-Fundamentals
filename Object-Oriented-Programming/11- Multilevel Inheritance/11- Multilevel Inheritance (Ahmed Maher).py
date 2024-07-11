# Author: Ahmed Maher

class Person:
    def __init__(self, name=None, age=0):
        self.__name = name
        self.__age = age
    
    def displayInfo(self):
        return f"Name: {self.__name}\nAge: {self.__age}"


class Employee(Person):
    def __init__(self, name, age, employeeID, department):
        Person.__init__(self, name, age)
        self.__employeeID = employeeID
        self.__department = department
    
    def displayInfo(self):
        return f"{Person.displayInfo(self)}\nEmployee ID: {self.__employeeID}\nDepartment: {self.__department}"
    
    def showDepartment(self):
        return f"{self.__name} employee in department: {self.__department}"


class Manager(Employee):
    def __init__(self, name, age, employeeID, department, numTeams):
        Employee.__init__(self, name, age, employeeID, department)
        self.numTeams = numTeams
    
    def displayInfo(self):
        return f"{Employee.displayInfo(self)}\nNumber of Teams: {self.numTeams}"
    
    def showTeams(self):
        return f"Number of Teams Managed: {self.numTeams}"


class Engineer(Employee):
    def __init__(self, name, age, employeeID, department, specialization):
        Employee.__init__(self, name, age, employeeID, department)
        self.specialization = specialization
    def displayInfo(self):
        return f"{Employee.displayInfo(self)}\nSpecialization: {self.specialization}"
    
    def showSpecialization(self):
        return f"Specialization: {self.specialization}"
    

manager = Manager("Ahmed Maher", 21, 2200001, "Ai", 4)
engineer = Engineer("Ali", 20, 2201177, "It", "web")

print(manager.displayInfo())
print( "-" * 50 )
print(manager.showTeams())
print( "-" * 50 )
print(engineer.displayInfo())
print( "-" * 50 )
print(engineer.showSpecialization())
