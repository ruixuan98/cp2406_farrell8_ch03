package ProgrammingExercises;


public class Percentages {
    public static void main(String[] args){
        double a=2, b=5;
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
