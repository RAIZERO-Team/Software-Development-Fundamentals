//Author: basmala mohamed

public class Complex {
    
    private double real;
    private double img;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    
    public Complex AddComplex(Complex complexNumber) {
        double newReal = real + complexNumber.real;
        double newImg = img + complexNumber.img;
        return new Complex(newReal, newImg);
    }

    public Complex SubComplex(Complex complexNumber) {
        double newReal = real - complexNumber.real;
        double newImg = img - complexNumber.img;
        return new Complex(newReal, newImg);
    }
    
    public void PrintComplex() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3,4); 
        Complex c2 = new Complex(1,2); 
        Complex c3 = c1.AddComplex(c2);

        System.out.println("Complex number: ");
        c3.PrintComplex();
    }
}