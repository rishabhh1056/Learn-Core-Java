import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101 */
public class Question17 {
    public static void main(String[] args) {

        long bin1 , bin2;
        int i=0, carry=0;
        int[] arr = new int[10]; 

        Scanner sc = new Scanner(System.in);

        System.out.println("inputl binary1");
        bin1=sc.nextLong();

        System.out.println("input binary2");
        bin2=sc.nextLong();

        while(bin1 != 0 || bin2 !=0)
        {
            arr[i++] = (int)((bin1%10 + bin2%10 + carry)%2);
            carry =  (int)((bin1%10 + bin2%10 + carry)/2);

            bin1=bin1/10;
            bin2=bin2/10;
        }

        if(carry != 0)
        {
            arr[i] = carry;
        }

        System.out.println("addition of two binaries");

        while(i>=0)
        {
              System.out.println(arr[i--]);
        }
        //System.out.println("\n");
    

        
    }
}
