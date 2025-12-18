import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
			A=A.replace("c=", "1");
			A=A.replace("c-", "2");
			A=A.replace("dz=", "3");
			A=A.replace("d-", "4");
			A=A.replace("lj", "5");
			A=A.replace("nj", "6");
			A=A.replace("s=", "7");
			A=A.replace("z=", "8");
			System.out.println(A.length());
		scan.close();
	}
}