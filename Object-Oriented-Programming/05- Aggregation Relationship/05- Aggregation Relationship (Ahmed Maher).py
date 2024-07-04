# Author: Ahmed Maher


class University :
    def __init__(self, name="" ):
        self.__name = name
        self._departments = []
    
    def addDepartment(self, department):
        self._departments.append(department)
    
    def displayy(self , department):
        print(f"University: {self.__name} \n{department.printAll()}")


class Department :
    def __init__(self, departmentName, location, headOfDepartment):
        self.__departmentName = departmentName
        self.__location = location
        self.__headOfDepartment = headOfDepartment
    
    def getDepartmentName (self):
        return self.__departmentName
    def setDepartmentName(self, departmentName):
        self.__departmentName = departmentName
    
    def getLocation(self):
        return self.__location
    def setLocation(self, location):
        self.__location = location
    
    def getHeadOfDepartment(self):
        return self.__location
    def setHeadOfDepartment(self, headOfDepartment):
        self.__headOfDepartment = headOfDepartment
    
    def printAll(self):
        return f"Department Name : {self.__departmentName} \nLocation : {self.__location} \nHead of department : {self.__headOfDepartment}"


dep1 = Department("Computer Science", "Building A", "Dr.Ahmed")
dep2 = Department("IT", "Building B", "Dr.Ali")
dep3 = Department("AI", "Building A", "Dr.Mona")

uni = University("EELU University")

uni.addDepartment(dep1)
uni.addDepartment(dep2)
uni.addDepartment(dep3)

uni.displayy(dep1)
print( "*" * 50 )
uni.displayy(dep2)
print( "*" * 50 )
uni.displayy(dep3)
