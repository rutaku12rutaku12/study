import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] B = new int[5];
		int sum = 0;
		for(int i =0; i<5; i++) {
			int A = scan.nextInt();
			B[i]=A;
			sum+=A;
		}
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(B[i]>B[j]) { // 10 40 30 60 30
					int temp = B[i];
					B[i] = B[j];
					B[j] = temp;
				}
			}
		}
		System.out.println(sum/5);
		System.out.println(B[2]);
		scan.close();
	}
}