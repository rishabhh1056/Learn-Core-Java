package if_else_statement;
import java.util.Scanner;

public class if_else_ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num =sc.nextInt();

        if(num>=0)
        {
          System.out.print("Positive number");
        }
        else
        System.out.print("negitive number");
    }
}
