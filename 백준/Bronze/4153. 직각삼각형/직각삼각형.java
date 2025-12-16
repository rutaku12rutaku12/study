import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			if(A==0 && B==0 && C==0) {
				break;
			}
			if(C>B && C>A) {
				a=A;
				b=B;
				c=C;	
			}
			if(B>C && B>A) {
				a=A;
				b=C;
				c=B;
			}
			if(A>C && A>B) {
				a=C;
				b=B;
				c=A;
			}
			if((a*a)+(b*b)==(c*c)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		scan.close();
	}
}