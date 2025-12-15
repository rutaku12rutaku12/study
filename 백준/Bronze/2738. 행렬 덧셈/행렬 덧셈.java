import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] C = new int[N][M];
		for(int i=0; i<N;i++) {
			for(int j =0; j<M; j++) {
				A[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<N;i++) {
			for(int j =0; j<M; j++) {
				B[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<N;i++) {
			for(int j =0; j<M; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}		
		for(int i=0; i<N;i++) {
			for(int j =0; j<M; j++) {
				System.out.print(C[i][j]+ " ");
			}System.out.println();
		}		
		scan.close();
	}
}