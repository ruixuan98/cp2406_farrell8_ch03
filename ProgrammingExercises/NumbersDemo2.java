package ProgrammingExercises;
import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first numer>> ");
        a = input.nextInt();
        System.out.print("Enter second number>> ");
        b = input.nextInt();
        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquared(a, b);
    }

    public static void displayTwiceTheNumber(int a, int b){
        System.out.println(a * 2);
        System.out.println(b * 2);
    }

    public static void displayNumberPlusFive(int a, int b){
        System.out.println(a + 5);
        System.out.println(b + 2);
    }

    public static void displayNumberSquared(int a, int b){
        System.out.println(a * a);
        System.out.println(b * b);
    }
    
}
