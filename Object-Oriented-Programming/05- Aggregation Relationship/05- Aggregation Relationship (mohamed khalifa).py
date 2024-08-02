class University :

    def __init__( self , name) -> None:
        self.name = name
        self.department = [] 

    def addDepartment(self , department):
        self.department.append(department)  
    def displayDepartments(self):
        for i in self.department :
            print(f"Department name  : {i.getDepartmentName()}")      
            print(f"Department location  : {i.getLocation()}")      
            print(f"Department HeadOfDepartment  : {i.getHeadOfDepartment()}")   
            print("*" * 45)   

class Department :
    def __init__(self , departmentName , location , headOfDepartment) -> None:
        self.__departmentName = departmentName
        self.__location = location
        self.__headOfDepartment = headOfDepartment


    def setDepartmentName(self ,departmentName):
        self.__departmentName = departmentName

    def setLocation(self ,location):
        self.__location = location    

    def setHeadOfDepartment(self ,headOfDepartment):
        self.__headOfDepartment = headOfDepartment     

    def getDepartmentName(self):
        return self.__departmentName
    
    def getLocation(self):
        return self.__location
    
    def getHeadOfDepartment(self):
        return self.__headOfDepartment
    



dept1 = Department("Computer Science", "Building A", "Dr. yasser")
dept2 = Department("Mathematics", "Building B", "Dr. mustafa")

university = University("EELU University")

university.addDepartment(dept1)
university.addDepartment(dept2)

university.displayDepartments()

