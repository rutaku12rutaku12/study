import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int j =0; j<N; j++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			while(a>10) {
				a-=10;
			}
			if(a==10) {
				System.out.println(10);
			}
				if(a==1 || a==5 || a==6) {
					System.out.println(a);
				}
				if(a==4) {
					while(b>3) {
						b-=2;
					}
					if(b%2!=0) {
						System.out.println(a);
					}
					else {
						System.out.println(6);
					}
				}
				if(a==9) {
					while(b>3) {
						b-=2;
					}
					if(b%2!=0) {
						System.out.println(a);
					}
					else {
						System.out.println(1);
					}
				}
				if(a==2 || a==3 || a==7 || a==8) {
					while(b>5) {
						b-=4;
					}
					String k = (int)Math.pow(a, b)+"";
					System.out.println(k.charAt(k.length()-1));
				}
			// 2 4 8 6  2
			// 3 9 7 1  3
			// 7 9 3 1  7
			// 8 4 2 6  8
		}
		scan.close();
	}
}