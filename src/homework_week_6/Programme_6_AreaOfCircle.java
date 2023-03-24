package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner declararion for reading input from console
        System.out.println(" Please enter the radius: ");
        double r = scanner.nextInt();
        Programme_6_AreaOfCircle programme6 = new Programme_6_AreaOfCircle();
        programme6.areaOfCircle(r);
    }
    // closing the scanner object
       // scanner.close();

    // Calculating the area of circle
    public static void areaOfCircle(double r) {
        double PI = Math.PI;
        double area = PI * r * r;
        System.out.println(" The area of the circle : is " + area);
    }

}
