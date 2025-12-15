import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			System.out.println(a+b-c);
			String A = a+"";
			String B = b+"";
			System.out.println(Integer.parseInt(A+B)-c);
		scan.close();
	}
}