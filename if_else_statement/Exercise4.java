
package if_else_statement;
import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number");
    int num = sc.nextInt();

    if (num>=1 && num<=7) {
        
        if (num==1) {
            System.out.println("Minady");
        }
        else if (num==2) {
            System.out.println("Tuesady");
        }
        else if(num==3){
            System.out.println("Wednesday");
        }
        else if(num==4){
            System.out.println("Thursay");
        }
        else if(num==5){
            System.out.println("Friday");
        }
        else if(num==6){
            System.out.println("Saturady");
        }
        else if(num==7){
            System.out.println("Sunday");
        }
    }
    else{
        System.out.println("pleast enter number between 1 to 7");
    }
    }
}
