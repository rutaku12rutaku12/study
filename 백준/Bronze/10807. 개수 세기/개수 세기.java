import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] B = new int[N];
        int sum = 0;
        int i = 0;
        for( i =0; i<B.length; i++){
            B[i]=scan.nextInt();
        }
        int v = scan.nextInt();
        for (i=0; i<B.length; i++){
            if(B[i]==v){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
