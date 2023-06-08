import java.util.Scanner;
import java.util.Arrays;

public class Lab6_6  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean swapped;
        double temp;
        try{
            System.out.print("Введите количество элементов массива: ");
            int x = scan.nextInt();
            double[] myArray = new double[x];
            for (int i = 0; i < x; i++) {
                System.out.print("Введите элемент массива': ");
                myArray[i] = scan.nextDouble();
            }
            int n = myArray.length;
            for (int i = 0; i < n; i++){
                swapped = false;
                for (int j = 0; j < n - i - 1; j++){
                    if (myArray[j] > myArray[j+1]){
                        temp = myArray[j];
                        myArray[j] = myArray[j + 1];
                        myArray[j + 1] = temp;
                        swapped = true;
                        if (!swapped){
                            break;
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