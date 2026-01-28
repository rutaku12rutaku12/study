import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int a = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int Y = 0;
			int M = 0;
			while(st.hasMoreTokens()) {
				int j = Integer.parseInt(st.nextToken());
				int y = j;
				int m = j;
					Y+=10*((y/30)+1);
					M+=15*((m/60)+1);
			}
			if(Y>M) {
				bw.write("M "+M);
			}
			else if(Y<M) {
				bw.write("Y "+Y);
			}
			else bw.write("Y M "+Y);
		bw.flush();
		bw.close();
	}
}