//Author: Shahd Mahmoud
package task14oop;

public class Task14oop {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        //Shape shape2 = new Shape();
        shape1.draw();
        System.out.println("Shape counter: " + Shape.getCounter());
        Circle circle1 = new Circle();
        //Circle circle2 = new Circle();
        circle1.draw();
        System.out.println("Circle counter: " + Circle.getCounter());
        Rectangle rectangle1 = new Rectangle();
        //  Rectangle rectangle2 = new Rectangle();

        rectangle1.draw();

        System.out.println("Rectangle counter: " + Rectangle.getCounter());
    }

}

class Shape {

    static int counter = 0;

    Shape() {
        counter++;
    }

    static int getCounter() {
        return counter;

    }

    void draw() {
        System.out.println("Drawing a Shape");
    }

}

class Circle extends Shape {

    static int counter = 0;

    Circle() {
        counter++;
    }

    static int getCounter() {
        return counter;

    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");

    }
}

class Rectangle extends Shape {

    static int counter = 0;

    Rectangle() {
        counter++;
    }

    static int getCounter() {
        return counter;

    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");

    }
}
