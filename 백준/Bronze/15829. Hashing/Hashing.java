import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		scan.nextLine();
		String A = scan.nextLine();
		long hash = 0;
		long pow=1;
		for(int i = 0; i < L; i ++) {
				int value = A.charAt(i)-'a'+1;
				hash = (hash+ value*pow)%1234567891;
				pow=pow*31%1234567891;
			}
		System.out.println(hash);
		scan.close();
	}
}