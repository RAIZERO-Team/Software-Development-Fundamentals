//Author:omnia zedan
public class Course {
    private String courseName;
    private int duration;
    public Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void setduration(int duration){
        this.duration=duration;
    }
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public String getcourseName(){
        return courseName;
    }
    public int getduration(){
        return duration;
    }
}
public class Student {
private String name;
private int age;
private int rollNumber;
private Course[] enrolledCourses;
public Student (String name,int age,int rollNumber){
   this.age=age;
   this.name=name;
   this.rollNumber= rollNumber;
   this.enrolledCourses = new Course[5];
}
public void setName (String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
public void setRollNumber(int rollNumber){
    this.rollNumber= rollNumber;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public int getRollNumber(){
    return rollNumber;
}
 public void enrollCourse(Course course) {
     int index = -1;
     for (int i = 0; i < enrolledCourses.length; i++) {
       if (enrolledCourses[i] == null) {
            index = i;
           break;
       }}
     if (index != -1) {
       enrolledCourses[index] = course;
     System.out.println(name +" enrolled in course"+course.getcourseName());
        } else {
         System.out.println(" Cannot enroll in more courses.");
        }
    }
 public void listEnrolledCourses() {
    System.out.println(name + " enrolled courses");
    for (int i = 0; i < enrolledCourses.length; i++) {
        if (enrolledCourses[i] != null) {
            System.out.println( enrolledCourses[i].getcourseName());
        }
    }
}
   
    public static void main(String[] args) {
       Course course1 = new Course("Math", 10);
        Course course2 = new Course("english", 12);
        Student student1 = new Student("Ali", 20, 1001);
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student1.listEnrolledCourses();
    }
}
    
    

