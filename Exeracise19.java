import java.util.Scanner;

/* Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101  */

public class Exeracise19 {
    public static void main(String[] args) {
        int num ,i=0 , j;
        int[] bin = new int[10];

        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
         num=sc.nextInt();

        while( num!=0)
        {
          bin[i++] = num%2;
          num = num/2;
        }
        System.out.println("binary is ="+bin[i]);
        for(j=i; j>0; j--)
        {
            System.out.println(bin[j]);
        }
        
    }
}
