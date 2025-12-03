import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];

        int i = 0;
        for( i =0; i<A.length; i++){
            A[i]=scan.nextInt();
        }
        System.out.print(Arrays.stream(A).min().getAsInt());
        System.out.print(" ");
        System.out.println(Arrays.stream(A).max().getAsInt());
        scan.close();
    }
}