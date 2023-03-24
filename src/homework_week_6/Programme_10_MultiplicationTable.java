package homework_week_6;

import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = scanner.nextInt();
        multiplicationTableOf(number);
        // closing the scanner object
        scanner.close();
    }
    // Printing the multiplication table of entered number
    public static void multiplicationTableOf(int n){
        System.out.println(n + " x " + 1 + " = " + (n));
        System.out.println(n + " x " + 2 + " = " + (n * 2));
        System.out.println(n + " x " + 3 + " = " + (n * 3));
        System.out.println(n + " x " + 4 + " = " + (n * 4));
        System.out.println(n + " x " + 5 + " = " + (n * 5));
        System.out.println(n + " x " + 6 + " = " + (n * 6));
        System.out.println(n + " x " + 7 + " = " + (n * 7));
        System.out.println(n + " x " + 8 + " = " + (n * 8));
        System.out.println(n + " x " + 9 + " = " + (n * 9));
        System.out.println(n + " x " + 10 + " = " + (n * 10));

    }
}
