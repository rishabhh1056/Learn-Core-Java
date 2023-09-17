import java.util.Scanner;

/*Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40 */

public class Exercise27 
{
    public static void main(String[] args) {
        int octnum , rem=1  ;
        String hex_decimal = "";
        String Octa;
        char[] hex_dec = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
         Octa=sc.nextLine();

         octnum= Integer.parseInt(Octa, 8);

         while(octnum!=0 )
         {
          rem = octnum%16;
          hex_decimal = hex_dec[rem]+hex_decimal;

          octnum=octnum/16;

         }
         System.out.println("octa to hex_decimal  = "+hex_decimal);


    }
}