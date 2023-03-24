package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter temperature value in degree Fahrenheit: ");
        float temp = scanner.nextFloat();
        convertTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }
    //Temperature conversion method
    public static void convertTempToDegreeCelsius (float temp){
        float c = (temp - 32) * 5/9;
        System.out.println("The temperature "+ temp + " fahrenheight is equals to " + c + " degree celsius "  );
    }

  }

