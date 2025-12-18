import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        int [] b = new int[N];
        for(int i =0; i<N;i++){
            b[i]=scan.nextInt();
            for(int j =0; j<N;j++) {
                if(b[j]>b[i]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println(b[N-k]);
    scan.close();
    }
}