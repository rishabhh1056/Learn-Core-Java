import java.util.Scanner;

/*Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938 */
public class Exercise34
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the lent of side of hexagon");
        double s = sc.nextDouble();

        System.out.println("the area of hexagon is =" + hexagonArea(s));
    }
    public static double hexagonArea(double s)
    {
        return ((6 * (s*s))/(4*Math.tan(Math.PI/6)));
    }
}