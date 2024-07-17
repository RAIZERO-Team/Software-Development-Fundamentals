//Author: Mahmoud Hazem

package org.example;
import java.lang.String;
import java.lang.*;

class Calculator {
    public int add(int x,int y){
        return x+y;
    }
    public double add(double x,double y,double z){
        return x+y+z;
    }
    public int add(int[]arr){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public  double add(double[]arr){
        double sum=0;
        for (double v : arr) {
            sum += v;
        }
        return sum;
    }

    public static void main (String[]args){
        Calculator calc = new Calculator();

        int [] arrInt = {9,8,5,2};
        double [] arrDouble = {1.5,2.8,8.5,10.2};

        System.out.println("sum two integer: " + calc.add(2, 1));
        System.out.println("sum three double: " + calc.add(1.5, 2.8, 8.5)) ;
        System.out.println("sum int arr: " + calc.add(arrInt));
        System.out.println("sum double arr: " + calc.add(arrDouble));
    }
}