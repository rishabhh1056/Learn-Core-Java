/*Write a Java program to compare a given string to the specified character sequence.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false */
package String;

public class Exercise8 {
    public static void main(String[] args) {
        String str1 = "Example";
        String str2 = "example";
        String str3 = "Example";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        
    }
}
