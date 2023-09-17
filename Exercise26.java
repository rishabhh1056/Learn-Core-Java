import java.util.Scanner;

/*Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111  */

public class Exercise26 {
    public static void main(String[] args) {
        int octa ,dec=0, rem, i=1, j;
        int[] bin = new int[10];

        Scanner sc=new Scanner(System.in);
        System.out.println("Input binary");
         octa=sc.nextInt();

         while(octa !=0)
         {
           rem = octa%10;
           dec = dec+rem*i; 
           i=i*8;
           octa = octa/10;
         }
         i=0;
         while(dec!=0)
         {
           bin[i++] = dec%2;
           dec=dec/2;
         }

         System.out.println("dec to binary");

         for(j=i-1; j>=0; j--)
         {
           System.out.println(bin[j]);
         }
         

        
        
    }
}
