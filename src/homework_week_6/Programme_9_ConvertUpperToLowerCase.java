package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }
    //Conversion of Uppercase to Lower case method
    public static void convertUpperCaseToLowerCase(String s1) {
        System.out.println("The lower case string is: " + s1.toLowerCase());
    }


}
