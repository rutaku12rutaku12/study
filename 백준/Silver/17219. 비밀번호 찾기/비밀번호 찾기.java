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
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Map<String,String> map = new HashMap<>();
		for(int i =0; i<A;i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			String a = stt.nextToken();
			String b = stt.nextToken();
			map.put(a, b);
		}
		for(int i=0; i<B; i++) {
			String K = br.readLine();
			String result = map.get(K);
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
	}
}