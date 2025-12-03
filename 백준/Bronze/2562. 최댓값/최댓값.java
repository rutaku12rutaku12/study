import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[9];
        int i,j = 0;
        for( i =0; i<A.length; i++){
            A[i]=scan.nextInt();

        }
        System.out.println(Arrays.stream(A).max().getAsInt());
        int K =Arrays.stream(A).max().getAsInt();
        for ( j = 0; j<A.length; j++){
            if(A[j] == K){
                System.out.println(j+1);
            }
        }
        scan.close();
    }
}