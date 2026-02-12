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
		int [] zero = new int[41];
		int [] one = new int[41];
		zero [0] = 1;
		zero [1] = 0;
		one [0] = 0;
		one [1] = 1;
		for(int i=2; i<=40; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		for(int i=0; i<T; i++) {
			int a = Integer.parseInt(br.readLine());
			bw.write(zero[a]+" "+one[a]+"\n");
		}
		bw.flush();
		bw.close();
	}
}