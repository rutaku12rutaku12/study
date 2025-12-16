import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [] size = new int[6];
		int t = 0;
		for(int i=0; i<6; i++) {
			int S = scan.nextInt();
			size[i]=S;
		}
		int 티묶음 = scan.nextInt();
		int 펜묶음 = scan.nextInt();
		for(int i=0; i<6; i++) {
			if(size[i]!=0) {
				t++;
			}
			while(size[i]>티묶음) {
				size[i]=size[i]-티묶음;
				t++;
			}
		}System.out.println(t);
		//if(N%펜묶음==0) {
		//	System.out.println(N/펜묶음);
		//} else {
			System.out.println(N/펜묶음+" "+N%펜묶음);
		//}
		scan.close();
	}
}