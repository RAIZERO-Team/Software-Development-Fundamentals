//Author : omnia zedan
public class Shape {

    private double width;
    private double height;
    public Shape(double width, double height){
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }
public double getWidth(){
  return width;  
}
public void setheight(double height){
        this.height=height;
    }
public double getheight(){
    return height;
}


public double  areaoftheshape( ){
    return height*width;
}



    public static void main(String[] args) {
        // TODO code application logic here
        Shape h=new Shape(15,14);
       System.out.println( h.areaoftheshape());
       Circle c=new Circle(5.7);
       System.out.println(c.areaoftheshape());
    }

}
public class Circle extends Shape {
    private double  radius;
    
    
    public Circle( double radius){
        super(0,0);
        this.radius=radius;
    }
    
    
    @Override
    public double areaoftheshape (){
        return(radius*radius)*3.14;
                
    }
    public void setradius(double radius){
        this.radius=radius;
    }
     public double getradius(){
         return radius;
     }          
    
}
