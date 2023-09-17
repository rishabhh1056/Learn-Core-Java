package String;
/*Write a Java program to get the index of all the characters of the alphabet.

Sample Output:

a  b c  d e  f  g h i  j                                                                                     
=========================                                                                                     
36 10 7 40 2 16 42 1 6 20                                                                                     
                                                                                                   
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 12 23 4 11 24 31                                                                                   

u  v  w  x  y  z                                                                                              
================                                                                                              
5 27 13 18 38 37 */

public class Exercise16 {
    public static void main(String[] args)
        {
            String str = "The quick brown fox jumps over the lazy dog.";
    
            // Get the index of all the characters of the alphabet
            // starting from the beginning of the String.
            int a = str.lastIndexOf("a", str.length() - 1);
            int b = str.lastIndexOf("b", str.length() - 1);
            int c = str.lastIndexOf("c", str.length() - 1);
            int d = str.lastIndexOf("d", str.length() - 1);
            int e = str.lastIndexOf("e", str.length() - 1);
            int f = str.lastIndexOf("f", str.length() - 1);
            int g = str.lastIndexOf("g", str.length() - 1);
            int h = str.lastIndexOf("h", str.length() - 1);
            int i = str.lastIndexOf("i", str.length() - 1);
            int j = str.lastIndexOf("j", str.length() - 1);
            int k = str.lastIndexOf("k", str.length() - 1);
            int l = str.lastIndexOf("l", str.length() - 1);
            int m = str.lastIndexOf("m", str.length() - 1);
            int n = str.lastIndexOf("n", str.length() - 1);
            int o = str.lastIndexOf("o", str.length() - 1);
            int p = str.lastIndexOf("p", str.length() - 1);
            int q = str.lastIndexOf("q", str.length() - 1);
            int r = str.lastIndexOf("r", str.length() - 1);
            int s = str.lastIndexOf("s", str.length() - 1);
            int t = str.lastIndexOf("t", str.length() - 1);
            int u = str.lastIndexOf("u", str.length() - 1);
            int v = str.lastIndexOf("v", str.length() - 1);
            int w = str.lastIndexOf("w", str.length() - 1);
            int x = str.lastIndexOf("x", str.length() - 1);
            int y = str.lastIndexOf("y", str.length() - 1);
            int z = str.lastIndexOf("z", str.length() - 1);
            
            System.out.println("a b c d e f g h i j k ");
            System.out.println("======================");
            System.out.println(a+" "+ b+" "+ c+" "+ d+" "+ e+" "+f+" "+ g+" "+ h+ " "+ i+ " "+ j+" "+ k );
            System.out.println("                      ");
            System.out.println("l m n o p q r s t u v ");
            System.out.println("======================");
            System.out.println(l+" "+ m+" "+ n+" "+ o+" "+ p+" "+q+" "+ r+" "+ s+ " "+ t+ " "+ u+" "+ v );
            System.out.println("                      ");
            System.out.println("w x y z");
            System.out.println("======================");
            System.out.println(w+" "+ x+" "+ y+" "+ z );






        }
    }
    