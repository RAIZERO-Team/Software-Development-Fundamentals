class Course {
  String _courseName;
  int _duration;

  Course(this._courseName, this._duration);

  String get courseNameOfStudent => _courseName;

  set courseNameOfStudent(String courseNameOfStudent) {
    this._courseName = courseNameOfStudent;
  }

  int get durationOfCourse => _duration;

// validation duration to check if that greater than 0 or not
  set durationOfCourse(int durationOfCourse) {
    if (durationOfCourse > 0) {
      this._duration = durationOfCourse;
    } else {
      print("Duration of course must be greater than 0");
    }
  }
}

class Student {
  String _name;
  int _age;
  int _rollNumber;
  List<Course> _enrollcourses = [];

  Student(this._name, this._age, this._rollNumber);

  String get studentName => _name;

  set studentName(String studentName) {
    this._name = studentName;
  }

  int get studentAge => _age;

// validation studentAge to check if that greater than 0 or not
  set studentAge(int studentAge) {
    if (studentAge > 0) {
      this._age = studentAge;
    } else {
      print("Age of student must be greater than 0");
    }
  }

  int get studentRollNumber => _rollNumber;

  set studentRollNumber(int studentRollNumber) {
    this._rollNumber = studentRollNumber;
  }

// make sure if LIst of course contained the same course or not , if not added it
  void enrollInCourseOFList(Course course) {
    if (_enrollcourses.any((c) => c._courseName == course._courseName)) {
      print('Error: ${course._courseName} Already enrolled to ${_name}.');
    } else {
      _enrollcourses.add(course);
      print('Course ${course._courseName} added Succecfully to ${_name}.');
    }
  }

// display all courses that student had
  List<Course> get enrollCourseOFList => List.unmodifiable(_enrollcourses);
}

void main() {
  Course course1 = Course("C++", 15);
  Course course2 = Course("Java", 10);
  Course course3 = Course("Dart", 20);
  Course course4 = Course("Dart", 20);

  Student student1 = Student("karol hany", 20, 1);
  student1.enrollInCourseOFList(course1);
  student1.enrollInCourseOFList(course2);
  student1.enrollInCourseOFList(course3);
  student1.enrollInCourseOFList(course4);//Error

  student1.enrollCourseOFList;
}
