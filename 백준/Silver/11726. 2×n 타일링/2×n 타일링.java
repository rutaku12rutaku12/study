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
		int n = Integer.parseInt(br.readLine());
		BigInteger dp [] = new BigInteger [100008];
		dp[1]=new BigInteger("1");
		dp[2]=new BigInteger("2");
		dp[3]=new BigInteger("3");
		dp[4]=new BigInteger("5");
		dp[5]=new BigInteger("8");
		for(int i=6;i<=n;i++) {
			dp[i]=dp[i-2].add(dp[i-1]);
		}
		bw.write(dp[n].mod(BigInteger.valueOf(10007))+"");
		bw.flush();
		bw.close();
	}
}
