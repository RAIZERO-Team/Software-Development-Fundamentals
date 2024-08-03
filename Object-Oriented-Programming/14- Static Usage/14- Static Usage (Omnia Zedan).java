//Author : omnia zedan

public class Shape {
    static int counter = 0;

    Shape() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public static void main(String[] args) {
        Shape s = new Shape();
         System.out.println("Total shapes: " + Shape.getCounter());
          s.draw();
        Circle c = new Circle();
         System.out.println("Total circles: " + Circle.getCounter());
         c.draw();
        Rectangle r = new Rectangle();
        System.out.println("Total rectangles: " + Rectangle.getCounter());
        r.draw();
      
    }
}

class Circle extends Shape {
    static int circleCounter = 0;

    Circle() {
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
    static int rectangleCounter = 0;

    Rectangle() {
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
