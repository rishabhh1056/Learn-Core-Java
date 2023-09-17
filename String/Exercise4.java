package String;

public class Exercise4 {
    public static void main(String[] args) {
        String s1 = "rishabh.com";

        System.out.println("orginial String"+ s1);

        int var1 = s1.codePointCount(4,8);
        System.out.println("String code point "+var1);
    }
}
