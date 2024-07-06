// Author: Reem Ezzat

public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
        Calculator test=new Calculator();
        int[] arr =new int[]{2,3,4,5}; //14
        double[] doubleArr =new double[]{2.4,3.5,4.2,5.7}; //15.8
System.out.println(
       "sum of two integer = "+ test.addition(3, 5)+
      "\nsum of three double = "+ test.addition(2.4, 3.6, 7.4)+
      "\nint sum of array = "+test.addition(arr)+
       "\ndouble sum of array = "+ test.addition(doubleArr)
                                       );
} }
 class Calculator{
 
 int addition (int a , int b){
 
 int result=a+b;
 return result;
 }
 
 double addition(double a, double b ,double c){
    double result=a+b+c;
    
    return result;
 }
 
 int addition(int arr[]){
    int result=0;
     for (int i = 0; i < arr.length; i++) {
        result=arr[i]+result;
     }
   return result;
 }
 
 double addition (double arr[]){
    double result=0;
      for (int i = 0; i < arr.length; i++) {
         result=arr[i]+result;
      }
   return result;
 
 }
 
 
 
 
 }