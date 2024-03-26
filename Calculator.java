/*Task # 3 
Create a class calculator. Create an equivalent four function calculator. When it finishes calculation, the 
program should ask whether the user wants to do another calculation. The response can be ‘y’ or ‘n’. 
Enter first number, operator and second number: 10 / 3 
Answer = 3.333333 
Do another (y/n) ? y 
Enter first number, operator and second number: 12 + 100 
Answer = 112 
Do another (y/n) ? n  */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter first number: ");
            double num1 = sc.nextInt();
            System.out.println("Enter operator : ");
            char opt = sc.next().charAt(0);
            System.out.println("Enter second number: ");
            double num2 = sc.nextInt();
            double result = 0;

            switch (opt) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("invalid operator ");
                    break;
            }
            System.out.println("The result is : " + result);
            System.out.println("Do you want to do another calculation? (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        System.out.println("Calculator is closed ");

        sc.close();

    }
}
