import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int T = scan.nextInt();
			int A = 0;
			int sum = 1;
			for(int i=0; i<T;i++) {
				int H = scan.nextInt();
				int W = scan.nextInt();
				int N = scan.nextInt();
				while(H < N) {
					N=N-H;
					sum++;
				}
				if(sum<10) {
					System.out.println((N)+"0"+(sum));
					sum=1;
				}
				else {
					System.out.println((N)+""+(sum));
					sum=1;
				}
			}
		scan.close();
	}
}