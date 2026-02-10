import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
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
		String A = (br.readLine());
		StringTokenizer st = new StringTokenizer(A);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet();
		for(int i=0; i<N;i++) {
			String a= br.readLine();
			set.add(a);
		}
		List<String> result = new ArrayList<>(); // 리스트쓰는이유 배열쓰면 크기고정
		for(int i=0; i<M;i++) {
			String b= br.readLine();
			if(set.contains(b)) {
				result.add(b);
			}
		}
		result.sort(null);
		bw.write(result.size()+"\n");
		for(int i=0; i<result.size();i++) {
			bw.write(result.get(i)+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}