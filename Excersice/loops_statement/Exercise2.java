/*Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23 */
package Excersice.loops_statement;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
    
    int n=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number");
    n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
}
}