/*Task # 1 
Create a class Multiples. Assume that you want to generate a table of multiples of any given number. 
Write a program that allows the user to enter the number and then generates the table, formatting it 
into 10 columns and 20 lines. Interaction with the program should look like this (only the first two lines 
are shown) 
Enter a number: 7 
7 14 21 28 35 42 49 63 70
77 84 91 98 105 112 119 126 133 140
*/

import java.util.Scanner;
class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 200; i++) {
            System.out.print(num * i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
            if (i == 20) {
                break;
            }

        }

        sc.close();
    }
}