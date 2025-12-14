import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String A = scan.nextLine();
			char [] K = new char[A.length()];
			int S = 0;
			for(int i = 0; i<K.length; i++) {
				K[i]=A.charAt(i);
			}
			for(int i = 0; i<K.length; i++) {
				if(K[i]==K[K.length-i-1]) {
					S= 1;
				}
				else {
					S=0;
					break;
				}
			}System.out.print(S);
			scan.close();
	} 
}