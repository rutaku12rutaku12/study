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
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int next =1;
		boolean is = false;
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int target = Integer.parseInt(br.readLine());
			while(next<=target) {
				stack.push(next);
				sb.append("+\n");
				next++;
			}
			if(stack.peek()==target) {
				stack.pop();
				sb.append("-\n");
			}else {
				is = true;
				break;
			}
		}
		if(!is) {
			System.out.print(sb);
		} else {System.out.print("NO");}
		bw.flush();
		bw.close();
	}
}