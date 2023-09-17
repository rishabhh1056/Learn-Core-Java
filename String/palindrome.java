package String;
/*
 * check string after reverse than check string are plaindrome yes or not ?.....
 */
public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String str2 = "";
        
        System.out.println("orginal string"+str2); //print str
        for (int i = str.length()-1; i >=0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);

        System.out.println("palindrome? "+str.equals(str2)); // check str or str2 are veryfiy plaindrome criteria yes or not..
    }
}
