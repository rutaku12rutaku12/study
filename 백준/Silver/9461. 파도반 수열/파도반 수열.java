
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
		int T = Integer.parseInt(br.readLine());
		long dp [] = new long [102];
			dp[1]=1;
			dp[2]=1;
			dp[3]=1;
			dp[4]=2;
			dp[5]=2;
			dp[6]=3;
			dp[7]=4;
			dp[8]=5;
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			for(int j=9;j<=N;j++) {
				dp[j]=dp[j-1]+dp[j-5];
			}
			bw.write(dp[N]+"\n");
		}
		bw.flush();
		bw.close();
	}
}