import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			// 킹1 퀸1 룩2 비숍2 나이트2 폰8
			int[] A = new int[6];
			for(int i = 0; i<A.length; i++) {
				A[i]=scan.nextInt();
			}
			System.out.print(A[0]<1 ? 1-A[0]+" " : (1-A[0])+" ");
			System.out.print(A[1]<1 ? 1-A[1]+" " : (1-A[1])+" ");
			System.out.print(A[2]<2 ? 2-A[2]+" " : (2-A[2])+" ");	
			System.out.print(A[3]<2 ? 2-A[3]+" " : (2-A[3])+" ");
			System.out.print(A[4]<2 ? 2-A[4]+" " : (2-A[4])+" ");
			System.out.print(A[5]<8 ? 8-A[5]+" " : 8-A[5]+" ");
	}
}