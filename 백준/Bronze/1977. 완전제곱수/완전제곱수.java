import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			int sum =0;
			int first =0;
			for(int i=0; i<N;i++) {
				if(i*i>=M && i*i<=N && first==0) {
					sum+=i*i;
					first+=i*i;
				}
				else if (i*i>=M && i*i<=N ){
					sum+=i*i;
				}
			}if(sum==0 && first==0) {
				bw.write("-1");
			} else bw.write(sum+"\n"+first);
		bw.flush();
		bw.close();
	}
}