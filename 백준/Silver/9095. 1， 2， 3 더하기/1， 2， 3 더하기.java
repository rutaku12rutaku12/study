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
		for(int i =0; i<n;i++) {
			int k = Integer.parseInt(br.readLine());
			int [] dp = new int[k+1];
			if(k>=1) {
				dp[1]=1;
			}
			if(k>=2) {
				dp[2]=2;
			}
			if(k>=3) {
				dp[3]=4;
			}
			for(int j=4; j<=k;j++) {
				dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
			}
			bw.write(dp[k]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
