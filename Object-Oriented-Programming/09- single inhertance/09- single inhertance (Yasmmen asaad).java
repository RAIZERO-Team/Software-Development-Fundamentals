//Author : Yasmeen asaad


public class Shape {
    private double width;
    private double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calc_area() {
        double area_shape = width * height;
        return area_shape;
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
}


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(radius * 2, radius * 2); 
        this.radius = radius;
    }

    @Override
    public double calc_area() {
        double area_circle = Math.PI * radius * radius;
        return area_circle;
    }

    public double getRadius() {
        return radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape(5.5, 3.3);
        double areaShape = s1.calc_area();
        System.out.println( areaShape);

        Circle c1 = new Circle(3.0);
        double areaCircle = c1.calc_area();
        System.out.println( areaCircle);
    }
}
