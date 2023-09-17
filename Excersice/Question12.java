import java.util.Scanner;

/*Write a Java program that takes three numbers as input to 
calculate and print the average of the numbers.
*/

public class Question12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input first number");
        int num1=sc.nextInt();

        System.out.println("input second numbers");
        int num2=sc.nextInt();
        System.out.println("input third number");
        int num3=sc.nextInt();

        int avg = (num1+num2+num3)/3;

        System.out.println(avg);
        
    }
}