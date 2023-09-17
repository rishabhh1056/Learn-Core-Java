/*Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

The pattern is as follows :

1
22
333
4444
Click me to see the solution */
package Excersice.loops_statement;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        num=sc.nextInt();

        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <=i ; j++) {
                
            
            System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    
}
