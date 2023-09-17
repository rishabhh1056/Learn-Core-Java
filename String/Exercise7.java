/*Write a Java program to concatenate a given string to the end of another string.

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises */
package String;

public class Exercise7 {
    public static void main(String[] args) {
        String str1 = "rishabh have h dog "; //creat string and declare str1 variable
        String str2 = "and hava a cat"; //create string and declare str2 variable

        System.out.println("After concetination");
        System.out.println("orginal   "+str1);
        System.out.println("orginal   "+str2);

        String str3 = str1 + str2; // assign str1 or str2 in str2 with concet

        System.out.println(str3); // print str3 
    }
}
