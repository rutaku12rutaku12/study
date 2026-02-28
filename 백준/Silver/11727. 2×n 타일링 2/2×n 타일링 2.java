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
		int [] dp = new int[n+1];
		if(n>=1)
		dp[1]=1;
		if(n>=2)
		dp[2]=3;
		if(n>=3)
		dp[3]=dp[2]+2;
		if(n>=4)
		dp[4]=dp[3]+dp[2]+dp[2];
		if(n>=5)
		for(int i=5; i<=n;i++) {
			dp[i]=(dp[i-1]+2*(dp[i-2]))%10007;
		}
		bw.write((dp[n])+"");
		bw.flush();
		bw.close();
	}
}
