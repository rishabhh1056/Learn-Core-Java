package Excersice.loops_statement;

public class partten2 {
    


    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++)
            {
              if (i+j==n/2|| i-j==n/2||i==n/2||j-i==n/2||i+j==(n-1)+(n)/2) {
                System.out.print("* ");
              }
              else  System.out.print("  ");
            }
            System.out.print("\n");


            System.out.print("                           ");

            
                for(int j=0; j<n; j++)
                {
                  if (i+j==n/2|| i-j==n/2||i==n/2||j-i==n/2||i+j==(n-1)+(n)/2) {
                    System.out.print("* ");
                  }
                  else  System.out.print("  ");
                }
                System.out.print("\n");
            
        }

    }
}


