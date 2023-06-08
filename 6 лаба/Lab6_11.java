import java.util.Scanner;
import java.util.Arrays;

public class Lab6_11  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int len1;
        int len2;
        boolean swapped1;
        boolean swapped2;
        int a1 = 0;
        int a2 = 0;
        double temp;
        try{
            System.out.print("Введите количество элементов массива: ");
            int x = scan.nextInt();
            double[] myArray = new double[x];
            double[] myArraysort = new double[x];
            for (int i = 0; i < x; i++) {
                System.out.print("Введите элемент массива': ");
                myArray[i] = scan.nextDouble();
            }
            if (x % 2 == 0){
                len1 = x / 2;
                len2 = x / 2;
            }
            else{
                len1 = x / 2;
                len2 = x / 2 + 1;
            }
            double[] myArray1 = new double[len1];
            double[] myArray2 = new double[len2];
            for (int i = 0; i < x; i++) {
                if (i % 2 == 0){
                    myArray2[a2] = myArray[i];
                    a2++;
                }
                else{
                    myArray1[a1] = myArray[i];
                    a1++;
                }
            }
            for (int i = 0; i < len1; i++){
                swapped1 = false;
                for (int j = 0; j < len1 - i - 1; j++){
                    if (myArray1[j] > myArray1[j+1]){
                        temp = myArray1[j];
                        myArray1[j] = myArray1[j + 1];
                        myArray1[j + 1] = temp;
                        swapped1 = true;
                        if (!swapped1){
                            break;
                        }
                    }
                }

            }
            for (int i = 0; i < len2; i++){
                swapped2 = false;
                for (int j = 0; j < len2 - i - 1; j++){
                    if (myArray2[j] > myArray2[j+1]){
                        temp = myArray2[j];
                        myArray2[j] = myArray2[j + 1];
                        myArray2[j + 1] = temp;
                        swapped2 = true;
                        if (!swapped2){
                            break;
                        }
                    }
                }

            }
            a1 = 0;
            a2 = 0;
            for (int i = 0; i < x; i++){
                while ((a1 < len1) && (a2 < len2)){
                    if (myArray1[a1] < myArray2[a2]){
                        myArraysort[i] = myArray1[a1];
                        a1++;
                    }  
                    else{
                        myArraysort[i] = myArray2[a2];
                        a2++;
                    }
                    i++;         
                }
                if (a1 == len1){
                    while (a2 < len2){
                        myArraysort[i] = myArray2[a2];
                        a2++;
                        i++;
                    }
                }
                if (a2 == len2){
                    while (a1 < len1){
                        myArraysort[i] = myArray1[a1];
                        a1++;
                        i++;
                    }
                }
            }
            System.out.print("Отсортированный массив: ");
            for(double values : myArraysort){
                System.out.print(values +" ");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Введена НЕ ЦИФРА!");
        }
        catch(java.lang.NegativeArraySizeException e){
            System.out.println("Куда так мало...");

        }
    }
}