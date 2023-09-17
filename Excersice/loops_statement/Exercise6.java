/*Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25 */
package Excersice.loops_statement;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter number");
    int n=sc.nextInt();
    int i=1, sum=0;
 
    while (i<=n) {
        System.out.println((2*i)-1);
         sum += (2*i)-1;
        i++;
    }
    System.out.println("sum of odd numbers: "+ sum);






    }
    
}
