package if_else_statement;

import java.util.Scanner;

public class Exercise7 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the alphabet");
    String alphabet = sc.next().toLowerCase();
    
   try{
    if (alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0)) ) {

        char ch=alphabet.charAt(0);

        if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowel");
        }
        else
        System.out.println("constant");
        
    }
    else 
      System.out.println("Error ,  please enter a only one alphabet");
   }
    catch(Exception e)
    {
        System.out.println("Exception");
    }
}
}
