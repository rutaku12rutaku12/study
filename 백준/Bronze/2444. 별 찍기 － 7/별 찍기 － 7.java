import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			for(int a = 0 ; a<N; a++) {
				for(int i=a; i<N-1; i++) {
					System.out.print(" ");	
				}
				for(int j = 0; j<=a; j++){
					System.out.print("*");
				}
				for(int j = 1; j<=a; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int a = 1 ; a<N; a++) {
				for(int i=N-a; i<N; i++) {
					System.out.print(" ");	
				}
				for(int j = 0; j<=N-a-1; j++){
					System.out.print("*");
				}
				for(int t = 1; t<=N-a-1; t++){
					System.out.print("*");
				}
				System.out.println();
			}
	} 
}