import java.util.Scanner;

public class Lab1_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите c: ");
        double c = input.nextDouble();

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        double y = (Math.sqrt(Math.pow(Math.E, (2*x+b))) - 1.7 * Math.cos(c * x)) / (Math.log(Math.pow(x, 2) + a));
        
        System.out.println("F(" + a +", " + b + ", " + c + ", " + x + ") = " + y);
    }
}