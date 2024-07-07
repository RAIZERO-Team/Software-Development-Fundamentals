// Author: Shahd Mahmoud

package task7oop;
//import java.util.*;
public class Task7oop {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sum = c1.add(10 , 20);
        System.out.println("Sum two int numbers: " + sum);
        double sumDouble = c1.add(3.4 , 3.7 , 2.5);
        System.out.println("Sum three double numders: " + sumDouble);
        int[] intArray = {0 , 1 , 2 ,3 };
        int sumArrayInt = c1.add(intArray);
        System.out.println("Sum int array: " + sumArrayInt);
        double[] doubleArray = {4.5 , 3.2 , 2.0};
        double sumArrayDouble = c1.add(doubleArray);
        System.out.println("Sum double array: " + sumArrayDouble);
    }
    
}
class Calculator {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public  double add (double a,double b,double c){
        double sum=a+b+c;
        return sum;
    } 
    public int add(int arr[]){
        int result=0;
     for (int i = 0; i < arr.length; i++) {
        result=arr[i]+result;
     }
   return result;
    }
    public double add(double arr[]){
        double result=0;
      for (int i = 0; i < arr.length; i++) {
         result=arr[i]+result;
      }
   return result;
 
 }
 
    }
