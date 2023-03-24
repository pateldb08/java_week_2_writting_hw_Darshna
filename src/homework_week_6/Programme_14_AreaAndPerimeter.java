package homework_week_6;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter the height of the perimeter: ");
        double height = scanner.nextDouble();
        areaAndPerimeterOfRectangel(width , height);
        // closing the scanner object
        scanner.close();

    }
    public static void areaAndPerimeterOfRectangel(double width,double height){
        double area = (width * height);
        double perimeter = 2 * (width + height);
        System.out.println("The area of the rectanagle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
}


}
