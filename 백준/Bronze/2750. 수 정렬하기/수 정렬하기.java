import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B[] = new int[A];
		for(int j =0; j<A; j++){
			int a = scan.nextInt();
			B[j]=a;
		}
		for(int i =0; i<A; i++) {
			for(int j =0; j<A; j++){
				if(B[i]>B[j]) { // 5 2 3 4 1
					int temp = B[i];
					B[i] = B[j];
					B[j] = temp;
				}
			}
		}
		for(int j =0; j<A; j++){
			System.out.println(B[A-j-1]);
		}
		scan.close();
	}
}