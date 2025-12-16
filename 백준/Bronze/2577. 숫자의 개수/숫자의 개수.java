import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			String K = A*B*C+"";
			int [] T = new int[10];
			for(int i =0; i<K.length(); i++) {
				for(int j =0; j<10; j++) {
					if(K.charAt(i)-'0'==j) {
						T[j] +=1;
					}
				}
			}
			for(int i=0; i<10; i++) {
				System.out.println(T[i]);
			}
		scan.close();
	}
}