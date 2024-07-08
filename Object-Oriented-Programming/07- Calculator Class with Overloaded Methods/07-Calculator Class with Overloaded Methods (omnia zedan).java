//Author:omnia zedan
public class Calcolator {
 public int add(int A,int B){
     return A+B;
 }
 public double add(double A,double B,double C){
     return A+B+C;
 }
 public int add(int[]arr){
     int sum=0;
     for(int i=0;i<arr.length;i++){
        sum +=arr[i] ;
     }
     return sum;
 } 
 public  double add(double[]arr){
     double sum=0;
     for(int i=0;i<arr.length;i++){
        sum +=arr[i] ;
     }
     return sum;
 }
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        Calcolator cal=new Calcolator();
        int [] arr = {3,4,5,6};
        double [] arr2={4.5,3.6,3.4,5.5,4.2};
        System.out.println("sum two integer:"+cal.add(3, 4));
         System.out.println("sum three double:"+cal.add(4.5, 3.7, 5.5)) ;
           System.out.println("sum int arr:"+cal.add(arr));
              System.out.println("sum double arr:"+cal.add(arr2));
    }}
    