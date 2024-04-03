import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            int a, b, c, d, num, den;
            char temp, option;
            System.out.print("Enter first fraction: ");
            a = scanner.nextInt();
            temp = scanner.next().charAt(0); // Read and discard '/'
            b = scanner.nextInt();

            System.out.print("Operator: ");
            option = scanner.next().charAt(0);

            System.out.print("Enter second fraction: ");
            c = scanner.nextInt();
            temp = scanner.next().charAt(0); // Read and discard '/'
            d = scanner.nextInt();

            switch (option) {
                case '+':
                    num = a * d + b * c;
                    den = b * d;
                    System.out.println("Sum is: " + num + "/" + den);
                    break;
                case '-':
                    num = a * d - b * c;
                    den = b * d;
                    System.out.println("Subtraction is: " + num + "/" + den);
                    break;
                case '*':
                    num = a * c;
                    den = b * d;
                    System.out.println("Multiplication is: " + num + "/" + den);
                    break;
                case '/':
                    num = a * d;
                    den = b * c;
                    System.out.println("Division is: " + num + "/" + den);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.print("Do you want to continue (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');

        System.out.println("Goodbye!");
        scanner.close();
    }
}
