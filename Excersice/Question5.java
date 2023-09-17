/*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

package Excersice;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        int num1=sc.nextInt();

        System.out.println("input second number");
        int num2=sc.nextInt();

        
        System.out.println(num1 +" * "+num2 +" = "+(num1 + num2));
        
    }
    
}
