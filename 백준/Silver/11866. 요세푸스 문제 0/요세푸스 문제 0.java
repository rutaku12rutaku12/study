import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		bw.write("<");
		for(int i =0 ; i<N; i++) {
			queue.add(i+1);
		}
		for(int i =0; i<N; i++) {
			for(int j =1; j<K; j++) {
				queue.add(queue.poll());
			}
			bw.write(queue.poll()+"");
			if(!queue.isEmpty()) {
				bw.write(", ");
			}
		}
		bw.write(">");
		bw.flush();
		bw.close();
	}
}