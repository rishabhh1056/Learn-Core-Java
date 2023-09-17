package String;

public class Exercise6 {
    public static void main(String[] args) {
        
        String str1 = "Rishabh have a 1 cat";
      
        String str2 = "Rishabh Have a 1 Cat";

        int result = str1.compareToIgnoreCase(str2);

        if (result<0) {
            System.out.println("\""+str1 + " is less than "+ str2+"\""); 
        }
        else if (result==0) {
            System.out.println("\""+str1 + " is Equal to "+ str2+"\""); 
        }
        else if(result>0){
        System.out.println("\""+str1 + " is greater than "+ str2+"\""); 
        }
        else 
        System.out.println("error "); 
    }
}
