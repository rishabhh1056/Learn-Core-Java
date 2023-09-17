/*Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

The pattern like :

1
2 3
4 5 6
7 8 9 10  */
package Excersice.loops_statement;

import java.util.Scanner;

public class Wxercise9 {
    public static void main(String[] args) {
        int num , k=1;;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        num=sc.nextInt();

        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <=i ; j++) {
                
            System.out.print(k++);
            System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
