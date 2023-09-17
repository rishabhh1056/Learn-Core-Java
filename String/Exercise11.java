/* Write a Java program to compare a given string to another string, ignoring case considerations.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true  */
package String;

public class Exercise11 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello iphone";
        String str3 = "hello world";


        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
