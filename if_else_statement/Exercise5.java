package if_else_statement;

import java.time.YearMonth;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the month");
        int month = sc.nextInt();

        System.out.println("Enter tne year");
        int year =sc.nextInt();

        YearMonth yearMonth =YearMonth.of(year, month);

        int dayInMonth = yearMonth.lengthOfMonth();

        System.out.println("Number of days in:" + yearMonth.getMonth()+ "" +year+ ":" +dayInMonth);
    }
}
