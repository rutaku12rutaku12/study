import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String A = scan.nextLine();
			A = A.toUpperCase();
			int[] count = new int[26];
			for( int j =0; j<A.length(); j++) {
					count[A.charAt(j)-'A']++;
			}
			int max=0;
			int same = 0;
			for(char i='A'; i<='Z';i++) {
				if(max < count[i-'A']) {
					max = count[i-'A'];
				}
			}
			for(char i='A'; i<='Z';i++) {
				if(max==count[i-'A']) {
					same ++;
				}
			}
			if(same>=2) {
				System.out.println("?");
			}
			else {
				for(char i='A'; i<='Z';i++) {
					if(max==count[i-'A'])
						System.out.println(i);
				}
			}scan.close();
	}
}