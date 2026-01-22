import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for(int i=0; i<K; i++) {
			int A = Integer.parseInt(br.readLine());
			stack.push(A);
			sum+=A;
			if(A==0) {
				stack.pop();
				sum-=stack.pop();
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}