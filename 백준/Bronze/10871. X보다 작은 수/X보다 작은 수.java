import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int X = scan.nextInt();

        int i = 0;
        for( i =0; i<A.length; i++){
            A[i]=scan.nextInt();
        }
        for( i =0; i<A.length; i++) {
            if (X > A[i]) {
                System.out.print(A[i]);
                System.out.print(" ");
            }
        }scan.close();
    }
}