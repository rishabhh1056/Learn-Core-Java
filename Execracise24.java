import java.util.Scanner;

/*Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 */

public class Execracise24 {
    public static void main(String[] args) {
       int bin , dec=0,rem , i=1, j;
       int octa[] = new int[100];
        
       Scanner sc=new Scanner(System.in);
        System.out.println("Input binary");
         bin=sc.nextInt();

         while(bin !=0)
         {
          rem = bin%10;
          dec = dec+rem*i;
          i = i*2;
          bin = bin/10;
         }
         System.out.println("bin to dec"+ dec);
         i=1;
         while(dec>0)
         {
           octa[i++]= dec%8;
           dec =dec/8;
         }
         System.out.print("decto oct =");
         for(j=i-1; j>0; j--)
         {
            System.out.print(octa[j]+"   ");
         }
    }
}
