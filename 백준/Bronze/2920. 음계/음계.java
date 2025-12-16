import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] K = new int[8];
			for(int i=0; i<8; i++) {
				int A = scan.nextInt();
					K[i]=A;
			}
			if( Arrays.toString(K).equals("[1, 2, 3, 4, 5, 6, 7, 8]")) {
				System.out.println("ascending");
			}
			else if( Arrays.toString(K).equals("[8, 7, 6, 5, 4, 3, 2, 1]")) {
				System.out.println("descending");
			}
			else System.out.println("mixed");
		scan.close();
	}
}