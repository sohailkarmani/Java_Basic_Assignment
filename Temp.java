/* Create a class Temp. Write a temperature-conversion program that gives the user the option of 
converting Fahrenheit to Celsius or vice versa. Then carry out the conversion. Use floating point 
numbers:
Type 1 to convert Fahrenhiet to Celsius, 
     2 to convert Celsius to Fahrenheit: 1 
Enter temperature in Fahrenheit: 70 
In Celsius: 21.111111  */

import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Fahrenhiet to Celsius :");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit :");
        int num = sc.nextInt();
        System.out.println("Enter Temp :");
        float a = sc.nextFloat();
        switch (num) {
            case 1: {

                double celsius = ((5 * (a - 32.0)) / 9.0);
                System.out.println("Temperature in celisius is :" + celsius);
                break;
            }
            case 2: {

                double fahrenheit = ((a * 9) / 5) + 32;
                System.out.println("Temperature in fahrenheit : " + fahrenheit);
            }

                sc.close();

        }

    }
}
