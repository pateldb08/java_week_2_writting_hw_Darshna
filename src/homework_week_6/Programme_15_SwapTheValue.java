package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {

        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first variable value : ");
            int firstN1 = scanner.nextInt();
            System.out.print("Enter the second variable value : ");
            int secondN2 = scanner.nextInt();
            System.out.println("Before the swapping : The value of first variable is : " + firstN1 + " and the value of second variabe is : " + secondN2);
            swapTheValue(firstN1 ,secondN2);
            // closing the scanner object
            scanner.close();
        }

    //Swapping the value of variables
    public static void swapTheValue(int a , int b){
        int temp = a;                  // or int c;
        a = b;                        //     c = a;
        b = temp;                      //    a = b;
                                      //     b = c;
        System.out.println("After the swapping: The value of first variable is : " + a + " and second variable is : " + b);


    }

}
