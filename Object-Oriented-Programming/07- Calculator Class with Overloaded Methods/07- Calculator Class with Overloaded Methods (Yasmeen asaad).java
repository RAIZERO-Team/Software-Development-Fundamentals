//Author: Yasmeen asaad

package calculatorr;

/**
 *
 * @author yasmeen asaad
 */
public class Calculatorr {

    public  int add(int x , int y){
        int sum = x+y;
        return sum;
        
    }
    public   double add(double x, double y, double z){
        double sum = x+y+z;
        return sum;
    }
    public  int add(int[] numbers){
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            sum=sum+numbers[i];
        }
        return sum;
    }
    public  double add(double[] numbers){
        double sum=0;
        for(int i=0; i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        return sum;
    }
    public void display(){
        System.out.println();
    }
    public static void main(String[] args) {
      
        Calculatorr calc =new Calculatorr();
       int sum1= calc.add(2, 6);
        System.out.println(sum1);
     double sum2= calc.add(2.2, 2.5, 1.5);
        System.out.println(sum2);
        
        int[] numbers1 = {1, 2, 3, 4, 5};
        int array1 = calc.add(numbers1);
        System.out.println(array1);
        double[] numbers2 = {1.5,2.5,3.5,4.5};
        double array2=calc.add(numbers2);
        System.out.println(array2);
        
       
    }
    
}
