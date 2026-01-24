import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int N = Integer.parseInt(br.readLine());
		int sum=0;
		int [] menu = new int [N];
		for(int i=0; i<N;i++) {
			menu[i] = Integer.parseInt(br.readLine());
		}
		int M = Integer.parseInt(br.readLine());
		for(int j=0; j<M; j++) {
			int B = Integer.parseInt(br.readLine());
			for(int i=0; i<menu.length;i++) {
				if(B==i+1) {
					sum+=menu[i];
				}
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}