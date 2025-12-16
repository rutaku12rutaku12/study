import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N[][] = new int[9][9];
		int max =0;
		int x=1;
		int y=1;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					N[i][j]=scan.nextInt();
					if(max<N[i][j]) {
						max=N[i][j];
						x=i+1;
						y=j+1;
					}
				}
			}
			System.out.println(max);
			System.out.println(x+" "+y);
		scan.close();
	}
}