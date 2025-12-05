import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N]; // 배열 내 한칸을 바구니로 생각하기
        int M = scan.nextInt(); // 공 넣는 횟수

        for (int i =0; i<N; i++){
            A[i] = 0;
        } // for end 배열에 순서대로 0 넣기
        for (int i =0; i<M; i++){
            int c = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();
            if(c==j){
                A[c-1]=k;
            }
            for ( int q=c; q<j; q++){
                A[q-1]=k;
                A[q]=k;
            }
        }
        for (int i =0; i<N; i++)
            System.out.print(A[i]+" ");
        scan.close();
    }
}