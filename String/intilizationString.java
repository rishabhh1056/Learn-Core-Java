package String;

public class intilizationString {
    public static void main(String[] args) {
        String str = "hello";

        String str1 = new String("hello");

        char[] at =  {'p','w'};

        String str2 =new String(at);


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str);

    }
}
