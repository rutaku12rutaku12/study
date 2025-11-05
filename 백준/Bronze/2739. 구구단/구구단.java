import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int i;
        for( i = 1; i <= 9 ; i++){
            System.out.println(A+" * "+i+" = "+A*i);
        }
        scan.close();
    }

}
