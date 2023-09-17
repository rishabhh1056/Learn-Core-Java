/*Write a Java program to get the contents of a given string as a byte array.

Sample Output:

The new String equals This is a sample String. */
package String;

public class Exercise13 {
    public static void main(String[] args) {
        String str = "This is a sample String";
        byte[] byte_arr= str.getBytes();

        String new_str = new String(byte_arr);

        System.out.println(new_str);
    }
}
