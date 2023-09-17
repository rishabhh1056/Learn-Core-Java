import java.util.Scanner;

class calculater {
  public void sum(int n1, int n2) {
    int result = n1 + n2;
    System.out.println("the sum is" + result);
  }

  public void sum(Double n1, Double n2) {
    double result = n1 + n2;
    System.out.println("the sum is" + result);
  }

  static void sub(Double n1, Double n2) {
       double result2=   n1 - n2;
       System.out.print("the sub is "+result2);
  }

  static void sub(int n1, int n2) {
      int result=  n1 - n2;
      System.out.print("the sub is "+result);
  }

}

public class calculater_using_overloading {
  public static void main(String[] args) {
    double n1, n2;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number");
    n1 = sc.nextDouble();

    System.out.print("enter number");
    n2 = sc.nextDouble();

    calculater obj = new calculater();

    if(n1%1==0) 
    {
     System.out.println("this solution use of integer method"); 
     obj.sum(n1, n2);
     calculater.sub(n1, n2);

    }
    else{
    
      obj.sum(n1,n2);
    calculater.sub(n1, n2);
    }
    

  }
}
