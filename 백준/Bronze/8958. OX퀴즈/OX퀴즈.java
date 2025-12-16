import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		int k = 0;
		int sum = 0;
			for(int i=0; i<N; i++) {
				String S = scan.nextLine();
				for(int j =0; j<S.length(); j++){
					if(S.charAt(j)=='O') {
						k=k+1;
						sum+=k;
					}else k=0;
				}System.out.println(sum);
				sum=0; k=0;
			}
		scan.close();
	}
}