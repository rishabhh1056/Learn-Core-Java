import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/* Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39 */

public class Exeracise32 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 =");
        num1 = sc.nextInt();

        System.out.print("Enter num2");
        num2 = sc.nextInt();
        if (num1 == num2) {

            System.out.println(num1 + "==" + num2);

        } else if (num1 >= num2) {
            if (num1 == num2) {
                System.out.println(num1 + ">=" + num2);
                System.out.println(num1 + "==" + num2);
            } else if (num1 != num2) {
                System.out.println(num1 + "!=" + num2);
                System.out.println(num1 + ">=" + num2);
            }

        } else if (num1 <= num2) {
            if (num1 != num2) {
                System.out.println(num1 + "<=" + num2);
                System.out.println(num1 + "!=" + num2);
            }

        }
    }
}
