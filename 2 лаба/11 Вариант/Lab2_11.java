import java.util.Scanner;

public class Lab2_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        if(x <= 4){
            double y = (Math.tan(b * x));
            System.out.println("F(" + a +", " + b + ", " + x + ") = " + y);
        }
        else{
            double y = (Math.sqrt(a + Math.abs(Math.sin(x))));
            System.out.println("F(" + a +", " + b + ", " + x + ") = " + y);
        }
        
    }
}