import java.util.Scanner;

public class Lab3_6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите символ С: ");
        char c=scan.nextLine().charAt(0);
        
        String A[] = new String [5];
        System.out.println("Введите эелементы массива: ");
        for(int i=0; i<5; i++){
                A[i] = scan.nextLine();
        }

        System.out.println("================");

        for (String s : A) { 
            System.out.print(" " + s);
            int n = s.length() - 1;
            while ((s.charAt(n) == c) && (n != 0)) { 
                n--; 
            }
            if(n!=0){
                s = s.substring(0, n + 1);
            }
            else{
                s ="";
            }
            
            System.out.println(" -> " + s); 
        }
    }
} 