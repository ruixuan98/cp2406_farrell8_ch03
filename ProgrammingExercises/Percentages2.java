package ProgrammingExercises;
import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args){
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number>> ");
        a = input.nextDouble();
        System.out.print("Enter next number>> ");
        b = input.nextDouble();
        computePercent(a, b);
    }
    public static void computePercent(double a, double b){
        double percent;
        System.out.println(a);
        System.out.println(b);
        percent = a/b;
        System.out.println(a + " is " + (int) (percent*100) + " percent of " + b );
    }
}
