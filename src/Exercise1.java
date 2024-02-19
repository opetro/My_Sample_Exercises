import java.util.Scanner;
public class Exercise1 {
    public static void main(String[]args){
        System.out.println("Welcome to exercise 1!");
        System.out.println("This exercise asks for a number N from the user and then prints N number of asterisks(*)");
        System.out.println("Please enter a number from the keyboard!");
        //scanner library to utilize input from keyboard(user input)
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println("The number user entered is" + " " + N);
        //loop to print asterisks based on number entered from user!
        for (int i=0; i<N; i++){
            //print of asterisks based on the number N that user has entered
            System.out.print("* ");
        }
    }
}
