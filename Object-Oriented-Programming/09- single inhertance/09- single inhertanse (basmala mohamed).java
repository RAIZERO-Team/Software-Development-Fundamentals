//Author: basmala mohamed

public class OOP {

    public static void main(String[] args) {
        Shape sh = new Shape(10 , 20);
        System.out.println(sh.calculatetheArea());

        Circle c = new Circle(2.5);
        System.out.println(c.getRadius());
        System.out.println(c.calculatetheArea());
    }
}

class Shape {
    private double width;
    private double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculatetheArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
  
    @Override
    public double calculatetheArea() {
        return Math.PI * radius * radius;
    }
}