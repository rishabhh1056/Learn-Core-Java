/*Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2"  */
package String;

public class Exercise5 {
    public static void main(String[] args) {
        String str1 = "Rishabh have a 1 cat";
        String str2 = "Rishabh have a 2 Dog";

        int result = str1.compareTo(str2);

        if (result<0) {
            System.out.println("\""+str1 + " is less than "+ str2+"\""); 
        }
        else if (result==0) {
            System.out.println("\""+str1 + " is Equal to "+ str2+"\""); 
        }
        else if(result>0){
        System.out.println("\""+str1 + " is greater than "+ str2+"\""); 
        }
        else 
        System.out.println("error "); 
        
    }
}
