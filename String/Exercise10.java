/*Write a Java program to check whether a given string ends with another string.

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true */
package String;

public class Exercise10 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Hello iphone";
        String str3 = "Hello world";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));
    }
}
