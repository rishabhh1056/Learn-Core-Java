/*Write a Java program to get the character at the given index within the string.

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i  */

package String;

import java.util.Scanner;

import if_else_statement.Scannaer;

public class Exercise {
    public static void main(String[] args) {
        String str = "Hello World";

        Scanner sc = new Scanner(System.in);
        System.out.println("orginal value is: "+ str);

        try {
            
        System.out.println("Enter the index value");
        int i = sc.nextInt();
        System.out.println("The character at position "+i+" is "+str.charAt(i));

        System.out.println("Enter the index value");
        int j = sc.nextInt();
        System.out.println("The character at position "+j+" is "+str.charAt(j));

         } 
         catch (Exception e) {
        System.out.println("please enter index vlaue bttween digits:  " + str.length());
    }

    }

   
}
