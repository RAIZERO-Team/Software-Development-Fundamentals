// Author: basmala mohamed

public class OOP {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        System.out.println("Number of Circles: " + Circle.getCounter());

        Rectangle r = new Rectangle();
        r.draw();
        System.out.println("Number of Rectangles: " + Rectangle.getCounter());
        
        System.out.println("Total number of Shapes: " + Shape.getCounter());
    }
}

class Shape {
    protected static int shapeCounter = 0;
    protected static int circleCounter = 0;
    protected static int rectangleCounter = 0;
    
    static {
        shapeCounter = 0;
        circleCounter = 0;
        rectangleCounter = 0;
    }
    
    public Shape() {
        shapeCounter++;
    }
    
    public static int getCounter() {
        return shapeCounter;
    }
    
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    
    public Circle() {
        super();
        circleCounter++;
    }
    
    public static int getCounter() {
        return circleCounter;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    
    public Rectangle() {
        super();
        rectangleCounter++;
    }
    
    public static int getCounter() {
        return rectangleCounter;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}