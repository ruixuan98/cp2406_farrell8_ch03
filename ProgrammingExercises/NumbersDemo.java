package ProgrammingExercises;

public class NumbersDemo {
    public static void main(String[] args){
        int a=2, b=4;
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
