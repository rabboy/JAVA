import java.util.Scanner;
import java.util.Arrays;



public class Lab4_6 implements Runnable{
    
    
    public void run() {
        int summa = 0;
        for (int i=0; j < y; j++) {
            summa = summa + myArray[i][j];
        }
        System.out.print(summa);
        public int getSum(){return summa;}
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int x = scan.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int y = scan.nextInt();
        int[][] myArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Введите элемент массива': ");
                myArray[i][j] = scan.nextInt();
            }
        }
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i+1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    sorted = false;
                }
            }
        }
        Thread t[] = new Thread[x];
        for (int i=0; i<x; i++) {
            t[i]=new Thread(myArray, i, y);
            t[i].setPriority((Thread.MIN_PRIORITY+Thread.MIN_PRIORITY) +(Thread.MAX_PRIORITY -Thread.MIN_PRIORITY)/t.length*i);
         }

         // Запуск потоков
       for (int i=0; i<x; i++) {
        t[i].start();
        System.out.println(t[i].getName()+" начался");
      }
      int[] nums ={};
      for (int o = 0; o < x; o++){
        nums = append(nums, t[o].getSum());
      }
     int[] numssort = nums;
     Arrays.sort(numsort);
     int ma = numsort[x - 1];
     System.out.println(ma);
    }
  }
