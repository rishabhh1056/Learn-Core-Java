abstract class overload
{
    static void sum(int num1 , int num2)
    {
        int result = num1+num2 ;
        System.out.println(result);
    }
    abstract void abs();

    static void minus()
    {
        System.out.println("hi this substruction area ");
        
    }
}

public class overloading implements overload
{

    public static void main(String[] args) {
      

        overload.minus();
        overload.sum(5, 8);
         
        
        

        

    }

}
