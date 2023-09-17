import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        int num , compute=0 , i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 =");
        num = sc.nextInt();

        while(num!=0)
         {
            i = num%10;

            compute = compute+i;
            num = num/10;
         }

         System.out.println("compute number is "+ compute);
    }
}
