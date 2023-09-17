/*Write a Java program to check whether a given string ends with another string.

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true */
package String;

public class Exercise9 {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String ends_str= "se";

        boolean ends = str1.endsWith(ends_str);
        boolean ends2 = str2.endsWith(ends_str);

        System.out.println("Python Exercises ends with (se)? "+ends);
        System.out.println("Python Exercise ends with (se)? "+ends2);
    }
}
