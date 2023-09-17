package String;

public class Reverse2 {
    public static void main(String[] args) {
        //case 2:   str = " rishabh kumar"
        //           s.o.p(kumar rishabh);...

       String str = "Rishabh Kumar";

       String str2= "";

       String srr[] = str.split(" ");

       System.out.println("orginal string"+str2);   // print string before reverse

       for (int i = srr.length-1; i >=0; i--) {
        
            str2 = str2+" " + srr[i];
       }

       System.out.println("after reverse "+str2);   // print after reversing string



             
    }
}
