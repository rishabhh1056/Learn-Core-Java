import java.util.Scanner;

public class Exercise21
{
    public static void main(String[] args) {
        
    
  int dec_num, i=1, j , quot;
  int[] octa_dec = new int[20];

  Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
         dec_num=sc.nextInt();

         quot = dec_num;

         while(quot !=0)
         {
            octa_dec[i++] = quot%8;

            quot=quot/8;
         }

         System.out.print("octa decimal is = ");

         for(j=i-1; j>0; j--)
         {
            System.out.print(octa_dec[j]);
         }
           
         System.out.print("\n");

    }
}