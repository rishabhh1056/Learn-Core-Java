package String;

import java.lang.reflect.Array;
import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String str1 = "the ClassRoom";
        String str2 = "School Master";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        char srr1[] = str1.toCharArray();
        char srr2[] = str2.toCharArray();

        Arrays.sort(srr1);
        Arrays.sort(srr2);

        if (Arrays.equals(srr1, srr2)) 
        {
            System.out.println("str1 == str2  is true");    
        }
        else
        System.out.println("str1 == str2  is false");
        

        

       

    }
}
