class Department {
  String _departmentName;
  String _location;
  String _headOfDepartment;

  Department(this._departmentName, this._location, this._headOfDepartment);

  String get departmentName => _departmentName;

  set departmentName(String departmentName) {
    this._departmentName = departmentName;
  }

  String get location => _location;

  set location(String location) {
    this._location = location;
  }

  String get headOfDepartment => _headOfDepartment;

  set headOfDepartment(String headOfDepartment) {
    this._headOfDepartment = headOfDepartment;
  }

  void displayDetails() {
    print('Department Name: $_departmentName');
    print('Location: $_location');
    print('Head of Department: $_headOfDepartment');
  }
}

class University {
  String _name;
  List<Department> _department = [];

  University(this._name);

  void addToDepartement(Department department) {
    this._department.add(department);
  }

  void displayDepartments() {
    print('University: $_name');
    print('Departments:');
    for (var department in _department) {
      department.displayDetails();
    }
  }
}

void main() {
  Department department1 = Department("IT", "floor 1", "DR/Hisham");
  Department department2 = Department("AI", "floor 2", "DR/Mohand");

  University uni1 = University("EELU");
  uni1.addToDepartement(department1);
  uni1.addToDepartement(department2);
  uni1.displayDepartments();
}
