//Author: Yasmeen asaad
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author yasmeen asaad
 */
public class Complex {

   private float real;
   private float img;

    public Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }

   
    public void setReal(float real) {
        this.real = real;
    }

    public void setImg(float img) {
        this.img = img;
    }

    public float getReal() {
        return real;
    }

    public float getImg() {
        return img;
    }

   
 public Complex AddComplex(Complex complex_Number) {
        float newReal = this.real + complex_Number.real;
        float newImg = this.img + complex_Number.img;
        return new Complex(newReal, newImg);
    }

   
    public Complex SubComplex(Complex complex_Number) {
        float newReal = this.real - complex_Number.real;
        float newImg = this.img - complex_Number.img;
        return new Complex(newReal, newImg);
    }

   

   
   public void PrintComplex(){
       System.out.println(real+"+"+img+"i");
   }
   
   
   
   
    public static void main(String[] args) {
        Complex c1=new Complex(3, 4);
        Complex c2=new Complex(1, 2);
        Complex c3 = c1.AddComplex(c2);
        c3.PrintComplex();
      
    }
    
}
