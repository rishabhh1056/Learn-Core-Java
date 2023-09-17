package array;

public class revrseArray {
    
   // Complete the function
    // str: input string
    public static void main(String[] args) {
        String world[] = {"S","t","r","r","i","n","g"};

        for(int i=world.length-1;  i>=0; i-- )
        {
             System.out.print(world[i]+" ");
        }
    }
}

