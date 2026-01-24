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
		int a =0;
		for(int i=1; i<10;i++) {
			for(int j=1;j<10;j++) {
				if(N==i*j) {
					a = 1;
					continue;
				}
			}
		}
		bw.write(a+"");
		bw.flush();
		bw.close();
	}
}