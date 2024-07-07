//Author: basmala mohamed

public class Calc {
    
    public int add(int n1 , int n2) {
        int sumResult = n1 + n2;
        return sumResult;
    }

    public double add(double n1 , double n2 , double n3) {
        double sumResult = n1 + n2 + n3;
        return sumResult;
    }

    public int add(int[] numbers) {
        int sumResult = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumResult = sumResult + numbers[i];
        }
        return sumResult;
    }

    public double add(double[] numbers) {
        double sumResult = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sumResult = sumResult + numbers[i];
        }
        return sumResult;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        int sumInt = c.add(1 , 2);
        System.out.println("Sum two int numbers: " + sumInt);
        double sumDouble = c.add(1.1 , 1.2 , 1.3);
        System.out.println("Sum three double numders: " + sumDouble);
        int[] intArray = {1 , 2 , 3 , 4};
        int sumArrayInt = c.add(intArray);
        System.out.println("Sum int array: " + sumArrayInt);
        double[] doubleArray = {2.1 , 2.2 , 2.3};
        double sumArrayDouble = c.add(doubleArray);
        System.out.println("Sum double array: " + sumArrayDouble);
    }
}