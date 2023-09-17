import java.util.Scanner;

/*Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
 the latitude of coordinate 1: 25
Input the longInputitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km  */
public class Exercise36 {
    public static void main(String[] args) {
        double x1 ,x2 ,y1 , y2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Input the X1 of coordinate 1: ");
        x1 =sc.nextDouble();
        
        System.out.print("Input the Y1 of coordinate 1: ");
        y1 =sc.nextDouble();

        System.out.print("Input the X2 of coordinate 2: ");
        x2 =sc.nextDouble();

        System.out.print("Input the Y2 of coordinate 1: ");
        y2 =sc.nextDouble();

        Double r = 6371.01;

        double Distance = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
         
        System.out.print("The area of Distance : "+ Distance);
    }
}
