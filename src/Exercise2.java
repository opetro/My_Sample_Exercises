import java.util.Arrays;
import java.util.Random;
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Exercise 2 where an array is created where many functions are executed!");
        int [] values= new int[10];
        Random Random = new Random();
        for(int i=0; i<values.length; i++){
            values[i]=Random.nextInt(101);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int value:values){
            if(value>max){
                max= value;
            }
            if(value<min){
                min=value;
            }
            sum+=value;
        }
        double average =(double) sum /values.length;
        //final results
        System.out.println("The array is: "+ Arrays.toString(values));
        System.out.println("The maximum value is: "+max);
        System.out.println("The minimum value is: "+min);
        System.out.println("The total of all numbers is: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Exercise 2 is finished successfully!");
    }
}
