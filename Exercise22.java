import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        int binary, decimal=0,rem , i=1 ;

        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
        binary=sc.nextInt();

        while(binary !=0)
        {
           rem = binary%10;
           

           decimal = decimal+ rem*i;
           i= i*2;
           binary = binary/10;
        }
        System.out.print(decimal+"\n");

        
    }
}
