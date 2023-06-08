import java.util.Scanner;
import java.util.Arrays;

public class Lab6_11  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int z = 0;
        try{
            System.out.print("Введите количество элементов массива: ");
            int x = scan.nextInt();
            double[] myArray = new double[x];
            for (int i = 0; i < x; i++) {
                System.out.print("Введите элемент массива': ");
                myArray[i] = scan.nextDouble();
            }
            boolean sorted = false;
            double temp;
            double stop;
            while(!sorted) {
                sorted = true;
                stop = true;
                for (int i = z; i < myArray.length - 1; i++) {
                    if (myArray[i] > myArray[i+1]) {
                        stop = false;
                        temp = myArray[i];
                        myArray[i] = myArray[i+1];
                        myArray[i+1] = temp;
                        sorted = false;
                    }
                    else{
                        if(!stop){
                            z++;
                        }
                    }
                }
            }
            System.out.print("Отсортированный массив: ");
            for(double values : myArray){
                System.out.print(values +" ");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Введена НЕ ЦИФРА!");
        }
    }
}