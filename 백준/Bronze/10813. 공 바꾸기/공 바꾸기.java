import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N]; // 배열 내 한칸을 바구니로 생각하기
        int M = scan.nextInt(); // 공 넣는 횟수
        for (int i =0; i<N; i++){
            A[i] = i+1;
        } // for end 배열에 순서대로 숫자 넣기
        for( int i =0; i<M; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int temp = A[a-1];
            A[a-1] = A[b-1];
            A[b-1] = temp;
        }
        for (int i =0; i<N; i++)
            System.out.print(A[i]+" ");
        scan.close();
    }
}