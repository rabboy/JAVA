import java.util.Scanner;

public class Lab2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        if(x <= -1){
            double y = (a * Math.tan(Math.pow(x,2)));
            System.out.println("F(" + a +", " + b + ", " + x + ") = " + y);
        }
        else{
            double y = (b + Math.pow(x,2) / (Math.pow(x,2) + a));
            System.out.println("F(" + a +", " + b + ", " + x + ") = " + y);
        }
        
    }
}