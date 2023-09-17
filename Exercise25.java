import java.util.Scanner;

/*Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8 */

public class Exercise25
{
    public static void main(String[] args) {
        int octa , rem , i=1, j;
        int dec=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Input binary");
         octa=sc.nextInt();


         while(octa != 0)
         {
            rem = octa%10;
            dec = dec+rem*i;
            i=i*8;

            octa=octa/10;

         }
           System.out.print(dec);
    }
}