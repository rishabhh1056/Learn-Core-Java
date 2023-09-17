


 public class array
 {

    public static int findIndex(int[] my_array, int t)
    {
        if (my_array == null) return -1;
        int i=0;
        int len = my_array.length;

        while (i<len) {
            if (i==t) return i;
            else i++; 
        }

        return 0;
    }
    public static void main(String[] args) {
      
        int my_array[] = {2,3,4,5,7};

        System.out.println(findIndex(my_array, 3));
      
    
  }
 }