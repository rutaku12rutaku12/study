import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		scan.nextLine();
		String A = scan.nextLine();
		int hash = 0;
		for(int i = 0; i < L; i ++) {
			for(int j = 'a'; j<='z'; j++) {
				A.charAt(i);
				if(A.charAt(i)==j){
				hash+=(j-'a'+1)*Math.pow(31,i);
				}
			}
		}System.out.println(hash);
		scan.close();
	}
}