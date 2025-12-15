import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
		String A = scan.nextLine();
		System.out.println(A);
		}
		scan.close();
	}
}