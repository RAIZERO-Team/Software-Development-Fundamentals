//Author: Mahmoud Hazem

package org.example;

class Complex{
    private double real;
    private double img;

    Complex(double real , double img){
        this.real = real;
        this.img = img;
    }

    void setReal(double real){
        this.real = real;
    }

    void setImg(double img){
        this.img = img;
    }

    double getReal(){
        return real;
    }

    double getImg(){
        return img;
    }

    Complex addComplex(Complex x){
         double reall = real + x.real ,
                imgg = img + x.img;

         Complex C11 = new Complex(reall , imgg);
         return C11;
    }

    Complex subComplex(Complex x){
        double reall = real - x.real ,
               imgg = img - x.real;

        Complex C22 = new Complex(reall , imgg);
        return C22;
    }

    void PrintComplex(){
        System.out.println(real + " + " + img + "i");
    }

}

public class Main {

    public static void main(String[] args) {

        Complex c1 = new Complex(3,4),
                c2 = new Complex(1,2),
                c3 = c1.addComplex(c2);
            
                c3.PrintComplex();

    }
}
