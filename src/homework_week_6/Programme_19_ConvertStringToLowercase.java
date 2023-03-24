package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowercase {
//    public static void main(String[] args) {
//        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
//        System.out.println("The string in upper case : " + s1);
//        System.out.println("The lower case of the String is : " + s1.toLowerCase());
//    }
public static void main(String[] args) {
    //Scanner declaration for reading input form console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the uppercase sentence: ");
    String uppercase = scanner.nextLine();
    Programme_19_ConvertStringToLowercase t = new Programme_19_ConvertStringToLowercase();
    t.convertStringToLowerCase(uppercase);
    //Closing the scanner object
    scanner.close();

}
    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}




