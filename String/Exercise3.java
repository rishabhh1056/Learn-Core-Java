package String;

public class Exercise3 {
    public static void main(String[] args) {
        String s1 = "rishabh.com";

        System.out.println("orginial String"+ s1);

        int var1 = s1.codePointBefore(1);
        System.out.println("String code point "+var1);

        int var2 = s1.codePointBefore(5);
        System.out.println("String code point "+var2);


    }
}
