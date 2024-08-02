// Author : Reem Ezzat


public class SW_Development_Fundamentals {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Complex c1 =new Complex(3,4);
        Complex c2=new Complex(1,2);
        
       
        
        Complex c3=c1.AddComplex(c2);        //addition
        Complex subtract=c1.SubComplex(c2);  //subtraction
        
        System.out.println("Addition result: ");
        c3.PrintComplex();
        System.out.println("Subtraction Result: ");
        subtract.PrintComplex();
        
        
        //float
         Complex floatc1 =new Complex(3.5f,4f);
        Complex floatc2=new Complex(1f,2.1f);
         Complex floatAddition =floatc1.AddComplex(floatc2);  //addition
        Complex floatSubtract=floatc1.SubComplex(floatc2);  //subtration
        System.out.println("\nFloat Addition result: ");
        floatAddition.PrintComplex();
        System.out.println("Float Subtraction result: ");
        floatSubtract.PrintComplex();

} }
  class Complex{
 float real;
 float img;
String complex;

    
     Complex(float real,float img){
     this.real=real;
     this.img=img;
      this.complex=(real+" + "+img+"i");

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
     
    public Complex AddComplex(Complex c){
      float new_real=real+c.real;
     float new_img=img+c.img;
      c=new Complex(new_real,new_img);

     return c; 
    }
    public Complex SubComplex(Complex c){
     float new_real=real-c.real;
     float new_img=img-c.img;
     
     c= new Complex(new_real,new_img);
     return c;
    }
     
    
     public  void PrintComplex(){
         if((real%(int)real==0 )&&( img%(int)img==0)){
            complex=((int)real+" + "+(int)img+"i");

             System.out.println(complex+"");
         }
     else{
         complex= (String.format("%.2f", real)+" + "+String.format("%.2f", img)+"i" );

           System.out.println(""+complex);}

         }
    }
