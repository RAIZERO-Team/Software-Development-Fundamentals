//Author: Shahd Mahmoud

package task9oop;

public class Task9oop {

    
    public static void main(String[] args) {
        Circle circle=new Circle(10);
       circle.Result();
    }
    
}
class Shape{
 double width;
 double height;
 Shape(double width,double height){
 this.width=width;
 this.height=height;
 
 }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
   double Area(){
  return 0;
   }
   
 }
class Circle extends Shape{
    double radius;
    Circle(double radius){
    super(0,0);
      this.radius=radius;
    
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double Area() {
        return 3.14 * radius * radius;
    }
    void Result(){
        System.out.println(Area());
    }
}