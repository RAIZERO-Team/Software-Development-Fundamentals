// Author: Reem Ezzat

public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
       Circle circle=new Circle(5);
       circle.displayResult();
} }

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
    double Area(){
    return 3.14*radius*radius;
    }
    void displayResult(){
        System.out.println("Area of circle = "+Area());
    }
}