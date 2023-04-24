import java.util.Scanner;

public class Lab1_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        double y = (a * x) / Math.sqrt(Math.pow(b, 2) + 2 * Math.pow(Math.E, x) - b * x);
        System.out.println("F(" + a +", " + b + ", " + x + ") = " + y);
    }
}
