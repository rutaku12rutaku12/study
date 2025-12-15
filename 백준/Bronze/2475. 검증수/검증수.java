import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<5;i++) {
			int N = scan.nextInt();
			sum+=N*N;
		}System.out.println(sum%10);
		scan.close();
	}
}