// Author: Reem Ezzat


public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
        Shape square=new Shape();
        square.draw();
        System.out.println("Shape 1 counter : "+Shape.getCounter());
        Shape triangle=new Shape();
        System.out.println("Shape 2 counter : "+Shape.getCounter());
        
        Circle circle1= new Circle();
        circle1.draw();
        System.out.println("circle 1 counter : "+Circle.getCounter());
        Circle circle2= new Circle();
        System.out.println("circle 2 counter : "+Circle.getCounter());
        
        Rectangle rectangle1=new Rectangle();
        rectangle1.draw();
        System.out.println("rectangle 1 counter : "+Rectangle.getCounter());
        Rectangle rectangle2=new Rectangle();
        System.out.println("rectangle 2 counter : "+Rectangle.getCounter());
        Rectangle rectangle3=new Rectangle();
        System.out.println("rectangle 3 counter : "+Rectangle.getCounter());
        
        System.out.println("\nnum of Circles : "+Circle.getCounter());
        System.out.println("\nnum of Rectangles: "+Rectangle.getCounter());
        
        System.out.println("\nTotal num of Shapes : "+Shape.getCounter());






        
       
} }
class Shape{
static int counter=0;
Shape(){
counter++;
}
static int getCounter(){
return counter;

}
 void draw(){
    System.out.println("Drawing a Shape");
}

}

class Circle extends Shape{
static int counter=0;
Circle(){
counter++;
}
static int getCounter(){
return counter;

}
@Override
void draw(){
    System.out.println("Drawing a Circle");

}
}

class Rectangle extends Shape{
    
static int counter=0;
Rectangle(){
counter++;
}
static int getCounter(){
return counter;

}
@Override
void draw(){
    System.out.println("Drawing a Rectangle");

}
}