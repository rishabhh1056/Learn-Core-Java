/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

package Excersice;

public class Question11 {
    public static void main(String[] args) {
        float Radius = (float) 7.5;
    
        double para = 2*3.14*Radius;
        System.out.println("Paremeter is = " +para);

        double area = 3.14*Radius*Radius ;

        System.out.println("area is = "+area);
    }
    
}
