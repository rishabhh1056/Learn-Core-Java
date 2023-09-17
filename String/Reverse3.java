package String;
/*
 * Case 3: Reverse String
 * 
 *  str = " rishabh kumar "
 *    *******Print should be********* *   
 *   S.O.P = hbahsir ramuk
 */

public class Reverse3 {
    public static void main(String[] args) {
        

        String str1= "rishabh kumar";
        String str2="";
        String str3="";
    
        System.out.println(str1); 

        for (int i = str1.length()-1; i >= 0; i--) {  // intilize string lenth
            str2 = str2+str1.charAt(i);                // reverse whole string
        }

        String srr[] = str2.split(" ");               // split string to array 
        
        for (int i = srr.length-1; i >= 0; i--) {     //intilize array lenth
            str3 = str3 +" "+srr[i];                  //revrse whole array 
        }

        System.out.println(str3);                     // print reversible array
    }
}
