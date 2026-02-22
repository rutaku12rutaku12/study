import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int [] arr = new int [N+1];
		int [] kec = new int [N+1];
		for(int i=1; i<=N; i++) {
			int n = Integer.parseInt(str.nextToken());
			arr[i]=n;
			kec[i] =kec[i-1]+arr[i];
		}
		for(int i=0; i<M; i++) {
			StringTokenizer ss = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(ss.nextToken());
			int J = Integer.parseInt(ss.nextToken());
			int sum = kec[J]-kec[I-1];
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}