/* Write a Java program to display the pattern like a right angle triangle with a number.

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910 */

package Excersice.loops_statement;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        num=sc.nextInt();

        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <=i ; j++) {
                
            
            System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
