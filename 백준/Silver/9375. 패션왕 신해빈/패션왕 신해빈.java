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
			Map<String,Integer> map = new HashMap<>();
			for(int j =0; j<k; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String cloth = st.nextToken();
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 0)+1);
			}
			int result  = 1;
			for(int count : map.values()) {
				result *=count+1;
			}bw.write(result-1+"\n");
		}
		bw.flush();
		bw.close();
	}
}