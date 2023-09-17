
package Excersice.loops_statement;

public class partten3 {
    public static void main(String[] args) {
       int n=10;
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j==0||i==0&&j<n/2||j==n-1&&i<n/3&&j>n/2||i==n/3&&j<n/2||i-j==n/3) 
            {
                System.out.print("* ");  
            }
            else
             System.out.print("  ");
            
        }
        System.out.println(" ");
       } 
    }
}
