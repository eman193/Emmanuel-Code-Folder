//BigOrSmall
//Emmanuel Mok
//Oct. 3, 2024
//enter integer and you get results

import java.util.Scanner;
public class BigOrSmall {
    public void biggiesmalls() {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first integer: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter second integer: ");
        num2 = keyboard.nextInt();
        if (num1 == num2)
        System.out.println("Integers are equal");
        else if (num1 > num2)
        System.out.println("First integer is bigger");
        else if (num1 < num2)
        System.out.println("First Integer is smaller");

        }
}
