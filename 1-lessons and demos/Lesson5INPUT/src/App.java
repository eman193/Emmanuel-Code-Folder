//Inputs A8
//Emmanuel Mok
//Sept. 24
//Input sutff to get outputs



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        double doOne, doTwo; 
  
        System.out.print("Enter a double :: ");
        doOne = keyboard.nextDouble();
        System.out.print("Enter another double :: ");
        doTwo = keyboard.nextDouble();
          
        System.out.println("First double input = " + doOne);
        System.out.println("Second double input = " + doTwo);

        double sum = (doOne + doTwo);
        System.out.println("Sum of the first and second double = " + sum);
    }
}
