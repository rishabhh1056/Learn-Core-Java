package if_else_statement;

import java.util.Scanner;

public class Exercise3 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number ");
            int num = sc.nextInt();

            if (num != 0) 
            {
                if(num>0){

                
                System.out.print("Positive number");
                }
                else{
                    System.out.println("negitive number");
                }
            }
            else{
                System.out.println("nuteral");
            }
            
        }    
}
