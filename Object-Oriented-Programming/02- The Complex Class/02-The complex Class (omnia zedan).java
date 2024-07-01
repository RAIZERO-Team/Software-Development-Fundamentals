//Author: omnia zedan
public class Complexclass {
private double real;
private double img;
public Complexclass(double real,double img){
    this.img=img;
    this.real=real;
}
public void Setreal(double real){
    this.real=real;
    
}
public double Getreal(){
    return real;
}
public void Setimg(double img){
    this.img=img;
}
public double Getimg(){
    return img;
}
public Complexclass addcomplex(Complexclass a){
    
     double real2=real+a.real;
     double img2=img+a.img;
     a=new Complexclass(real2,img2);
     return a;
}
public Complexclass SubComplex(Complexclass a){
     double real2=real-a.real;
     double img2=img-a.img;
     
     a= new Complexclass(real2,img2);
     return a;
    }
public  void PrintComplex(){
    System.out.println(real+"+"+img+"i");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complexclass c1=new Complexclass(3,4);
         Complexclass c2=new Complexclass(1,2);
           Complexclass  c3=c1.addcomplex(c2);
            Complexclass c4=c1.SubComplex(c2);
            c3.PrintComplex();
            c4.PrintComplex();
    }
    
}
