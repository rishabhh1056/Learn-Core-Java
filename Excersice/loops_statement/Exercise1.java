/*Write a Java program to display the first 10 natural numbers.

Expected Output :

The first 10 natural numbers are:                                                
                                                                                 
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
6                                                                                
7                                                                                
8                                                                                
9                                                                                
10 */
package Excersice.loops_statement;

public class Exercise1 {
    public static void main(String[] args) {
        int n=0;
        while (n<=10) {
            System.out.println(n);
            n++;
        }
    }
}
