/* Write a Java program to get the character (Unicode code point) at the given index within the string.

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101  */

package String;

public class Exercise2 {
    public static void main(String[] args) {
        String s1 = "rishabh.com";

        System.out.println("orginial String"+ s1);

        int var1 = s1.codePointAt(0);
        System.out.println("String code point "+var1);

        int var2 = s1.codePointAt(5);
        System.out.println("String code point "+ var2);

    }
    
}
