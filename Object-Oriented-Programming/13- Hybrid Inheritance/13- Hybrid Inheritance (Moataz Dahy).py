# Moataz Dahy

class Person:
    def __init__(self, name='', age=0):
        self.__name = name
        self.__age = age

    def display_info(self):
        print(f"Name: {self.__name}")
        print(f"Age: {self.__age}")


class Worker:
    def __init__(self, worker_id=0, role=''):
        self.__worker_id = worker_id
        self.__role = role

    def display_info(self):
        print(f"Worker ID: {self.__worker_id}")
        print(f"Role: {self.__role}")


class Employee(Person, Worker):
    def __init__(self, name, age, worker_id, role, employee_id=0, department=''):
        Person.__init__(self, name, age)
        Worker.__init__(self, worker_id, role)
        self.__employee_id = employee_id
        self.__department = department

    def display_info(self):
        Person.display_info(self)
        Worker.display_info(self)
        print(f"Employee ID: {self.__employee_id}")
        print(f"Department: {self.__department}")

    def show_departmrnt(self):
        print(f"Department: {self.__department}")

    def display_infoPerson(self):
        print(f"Employee ID: {self.__employee_id}")
        print(f"Department: {self.__department}")


class Contractor(Person, Worker):
    def __init__(self, name, age, worker_id, role, contractor_id, department,
                 contractDuration=0, project=''):
        Person.__init__(self, name, age)
        Worker.__init__(self, worker_id, role)
        self.__contractor_id = contractor_id
        self.__department = department
        self.__contractDuration = contractDuration
        self.__project = project

    def display_info(self):
        Person.display_info(self)
        Worker.display_info(self)
        print(f"Contractor ID: {self.__contractor_id}")
        print(f"Department: {self.__department}")
        print(f"Contract Duration: {self.__contractDuration}")
        print(f"Project: {self.__project}")

    def show_project(self):
        print(f"Project: {self.__project}")

    def display_infoWorker(self):
        print(f"Contract Duration: {self.__contractDuration}")
        print(f"Project: {self.__project}")


class Manager(Employee):
    def __init__(self, name, age, worker_id, role, employee_id, department, num_teams=0):
        Employee.__init__(self, name, age, worker_id, role, employee_id, department)
        self.__num_teams = num_teams

    def display_info(self):
        Employee.display_info(self)
        print(f"Number of Teams: {self.__num_teams}")

    def show_num_teams(self):
        print(f"Number of Teams: {self.__num_teams}")


class Enginner(Employee):
    def __init__(self, name, age, worker_id, role, employee_id, department,
                 specilization=''):
        Employee.__init__(self, name, age, worker_id, role, employee_id, department)
        self.__specilization = specilization

    def display_info(self):
        Employee.display_info(self)
        print(f"Specilization: {self.__specilization}")

    def show_specilization(self):
        print(f"Specilization: {self.__specilization}")


class Freelancer(Contractor):
    def __init__(self, name, age, worker_id, role, contractor_id, department, conDuration,
                 project, hourly_rate=0.0):
        Contractor.__init__(self, name, age, worker_id, role, contractor_id,
                            department, conDuration, project)
        self.__hourly_rate = hourly_rate

    def display_info(self):
        Contractor.display_info(self)
        print(f"Hourly Rate: {self.__hourly_rate}")

    def show_hourly_rate(self):
        print(f"Hourly Rate: {self.__hourly_rate}")


M = Manager('Zizo', 20, 3, 'Manager', 1, 'AI', 5)

E = Enginner('Abdo', 20, 3, 'Enginner', 1, 'developer', 'IT')

F = Freelancer('Ahmed', 20, 3, 'Freelancer', 1, 'AI,', '2', 'project', 20)

print("# The Info Of Manager: ")
M.display_info()
print("\n# The Number of The Team:")
M.show_num_teams()
print()

print("# The Info Of Enginner: ")
E.display_info()
print("\n# The Specilization:")
E.show_specilization()
print("\n# The Info Of Department: ")
E.show_departmrnt()
print("\n# The Info Of Person: ")
E.display_infoPerson()
print()

print("# The Info Of Freelancer: ")
F.display_info()
print("\n # The Hourly Rate:")
F.show_hourly_rate()





