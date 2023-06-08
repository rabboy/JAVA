import java.util.Scanner;

public class Lab3_11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String c = new String(" ");
        String str = new String("");

        System.out.print("Введите номер слова K: ");
        int K=scan.nextInt();
        
        System.out.println("Введите строку: ");
        String A = new String (scan.nextLine());
        A = scan.nextLine();


        System.out.println("================");

        int n = 1;

        for(int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == c.charAt(0)){
                n++;
            }
            if (n == K) {
                if (K!=1){
                    i++; 
                }
                while (A.charAt(i) != c.charAt(0) && i < A.length() ){
                    str += A.charAt(i);
                    i++;
                }
                break;
            }
        }
        System.out.println(str);
    }
}
