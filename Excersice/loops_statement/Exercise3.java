/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :


Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0  */
package Excersice.loops_statement;

import java.util.Scanner;

import if_else_statement.Scannaer;

public class Exercise3 {
   
    public static void main(String[] args) {
        int sum = 0 ,num=0;
        Scanner sc=new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Enter number"+i);
             num =sc.nextInt();

             sum += num;
            
        }

        int avg = sum/5;

        System.out.println("the sum is:  "+ sum+ " \nthe avg is: "+ avg);
         
        
    }
    
}
