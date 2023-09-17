/*Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D */
import java.util.Scanner;

public class Execracise23 {
    public static void main(String[] args) {
        int bin , dec=0, rem=0 , i=1 , j;
        
        int[] hexa = new int[100];

        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
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
         while(dec != 0)
         {
           hexa[i++] = dec%16;
           
           dec= dec/16;
          }
           System.out.println("Dec to hexa");
          for(j=i-1; j>0; j--)
          {
            if (hexa[j] > 9) 
            {
             System.out.print((char)(hexa[j] + 55)+"\n");
            } else
            {
             System.out.print(hexa[j]+"\n");
            }
          }

      }
}
