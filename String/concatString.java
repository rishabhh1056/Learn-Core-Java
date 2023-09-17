package String;

class concatString
{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat("world");

        String s3 = new String("rishabh");

        s3= s3.concat("Kumar");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "pw";
        String s5 = "pw" + "java";
        String s6 = "pw"+s4;
        String s7 = "pw" + 10;

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}