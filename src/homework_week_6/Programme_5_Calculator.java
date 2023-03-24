package homework_week_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {
    // static method
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println(" The addition of " + a + " and " + b + " is : " + result);
    }

    public static int substration(int a, int b) {
        int result = a - b;
        return result;
       // System.out.println(" The substraction of :" + a + " and " + b + "is" + result);
    }

    // Instance method
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //scanner diclaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int b = scanner.nextInt();
        addition(a, b);
        int result = a - b;
        System.out.println(" The substraction of " + a + " and " + b + " is " + result);
        //  int result = substration(a ,b);
        //System.out.println("The subtraction of " + a + " and " + b + " is : " + result);
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);
        int result1 = obj.division(a, b);
        System.out.println("The division of : " + a + " and " + b + " is " + result);
        // scanner closed.


    }


}
