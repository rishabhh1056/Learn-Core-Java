package String;

public class reverse1 {
    public static void main(String[] args) {
        // reverse string.....

        String str1= "rishabh kumar";
        String str2="";

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2+str1.charAt(i);
        }
        System.out.println(str2);
    }
}
