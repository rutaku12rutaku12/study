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
		int [] dp = new int[T+1];
		int [] sc = new int[T+1];
		for(int i =1; i<=T; i++) {
			sc[i] = Integer.parseInt(br.readLine());
		}
		dp[1]=sc[1];
		if( T>=2) {
			dp[2]=dp[1]+sc[2];
		}
		if( T>=3) {
			dp[3]=Math.max(sc[1]+sc[3], sc[2]+sc[3]);
		}
		for(int i =4; i<=T; i++) {
			dp[i] = Math.max(sc[i]+dp[i-2], dp[i-3]+sc[i]+sc[i-1]);
		}
		// 한번에 1칸 or 2칸
		// 연속 3칸 밟기 x
		// 마지막 무조건
		bw.write(dp[T]+"");
		bw.flush();
		bw.close();
	}
}