package String;

public class StringMerorymap {
    public static void main(String[] args) {
        String str = "rishabh";
        String str1 = "rishabh";

        System.out.println(str==str1);

        String str2 = new String("rishabh");
        String str3 = new String("rishabh");

        System.out.println(str2==str3);
    
    }
}
