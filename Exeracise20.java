import java.util.Scanner;

public class Exeracise20
{
    public static void main(String[] args) {
        int num , rem=0  ;
        String hex_decimal = "";
        char[] hex_dec = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
         num=sc.nextInt();

         while(num != 0)
         {
           rem = num%16;
           hex_decimal = hex_dec[rem]+hex_decimal;
           num = num/16;
          }
         System.out.println("the hexa deciaml is "+hex_decimal+"\n");
    
    }
}