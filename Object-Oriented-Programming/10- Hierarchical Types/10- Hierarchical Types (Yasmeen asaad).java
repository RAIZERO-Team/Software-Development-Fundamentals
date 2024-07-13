//Author: Yasmeen asaad



class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}


class Car extends Vehicle {
    private int numDoors;

    public Car(int numDoors, String brand, String model) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Number of Doors: " + numDoors);
    }
}


class Bike extends Vehicle {
    private int numGears;

    public Bike(int numGears, String brand, String model) {
        super(brand, model);
        this.numGears = numGears;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Brand: " + brand + ", Model: " + model + ", Number of Gears: " + numGears);
    }
}


public class Main {
    public static void main(String[] args) {
        Car c = new Car(4, "Mercedes", "Mercedes-Benz C-Class");
        Bike b = new Bike(5, "Yamaha", "R15");

        c.displayInfo();
        b.displayInfo();
    }
}
