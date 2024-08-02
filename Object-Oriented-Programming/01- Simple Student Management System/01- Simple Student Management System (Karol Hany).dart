class Student {
  String? _name;
  int? _age;
  double? _grade;

  Student() {
    _name = " ";
    _age = 0;
    _grade = 0.0;
  }

  Student.prametersConstructor(String name, int age, double grade) {
    this._name = name;
    this._age = age;
    this._grade = grade;
  }

  Student.copy(String name, int age) {
    this._name = name;
    this._age = age;
  }

  String? get name => _name;

  set name(String? name) {
    this._name = name;
  }

  int? get age => _age;

  set age(int? age) {
    this._age = age;
  }

  double? get grade => _grade;

  set grade(double? grade) {
    this._grade = grade;
  }

  void printDetails() {
    print("Name: ${_name} \nAge: ${_age} \nGrade: ${_grade}");
  }
}

void main() {
  Student student1 = new Student();
  student1.name = "Mariz Hany";
  student1.age = 19;
  student1.grade = 3.5;
  student1.printDetails();

print("###########################################");

  Student student2 = new Student.prametersConstructor("Karol Hany" , 20 , 3.7);
  student2.printDetails();
}
