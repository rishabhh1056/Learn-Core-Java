
package String;

/**
 * Write a Java program to create a distinct identifier for a given string.

Sample Output:

The hash for Python Exercises. is 863132599
 */
public class Exercise15 {

    public static void main(String[] args) {
        String str = "Python Exercises.";

        int hash_code = str.hashCode();

        System.out.println(str+" hash code is: "+hash_code);
    }
    
}